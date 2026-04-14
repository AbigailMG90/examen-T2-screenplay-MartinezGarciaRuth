package edu.pe.cibertec.runner.screenplay.tasks;

import edu.pe.cibertec.runner.screenplay.ui.BusquedaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProducto implements Task {
    private final String nombreProducto;

    public BuscarProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static BuscarProducto conNombre(String nombreProducto) {
        return instrumented(BuscarProducto.class, nombreProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreProducto)
                        .into(BusquedaPage.SEARCH_INPUT)
                        .thenHit(Keys.ENTER)
        );
    }
}