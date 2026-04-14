package edu.pe.cibertec.runner.screenplay.tasks;

import edu.pe.cibertec.runner.screenplay.ui.RegistroPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarseComo implements Task {
    private final String f, l, e, t, p;

    public RegistrarseComo(String f, String l, String e, String t, String p) {
        this.f = f; this.l = l; this.e = e; this.t = t; this.p = p;
    }

    public static RegistrarseComo conDatos(String f, String l, String e, String t, String p) {
        return instrumented(RegistrarseComo.class, f, l, e, t, p);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(f).into(RegistroPage.FIRST_NAME),
                Enter.theValue(l).into(RegistroPage.LAST_NAME),
                Enter.theValue(e).into(RegistroPage.EMAIL),
                Enter.theValue(t).into(RegistroPage.TELEPHONE),
                Enter.theValue(p).into(RegistroPage.PASSWORD),
                Enter.theValue(p).into(RegistroPage.CONFIRM_PASSWORD)
        );
    }
}
