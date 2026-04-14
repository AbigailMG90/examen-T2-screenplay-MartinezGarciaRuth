package edu.pe.cibertec.runner.screenplay.tasks;

import edu.pe.cibertec.runner.screenplay.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarrito implements Task {

    public static AgregarAlCarrito elProducto() {
        return instrumented(AgregarAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoPage.ADD_TO_CART_BUTTON)
        );
    }
}