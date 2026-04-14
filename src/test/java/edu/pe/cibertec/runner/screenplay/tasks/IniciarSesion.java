package edu.pe.cibertec.runner.screenplay.tasks;

import edu.pe.cibertec.runner.screenplay.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {
    private final String email;
    private final String password;

    public IniciarSesion(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static IniciarSesion conCredenciales(String email, String password) {
        return instrumented(IniciarSesion.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.EMAIL_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}