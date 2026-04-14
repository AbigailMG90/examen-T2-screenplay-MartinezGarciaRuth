package edu.pe.cibertec.runner.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {
    public static final Target NO_RESULTS_MESSAGE = Target.the("mensaje de no resultados")
            .locatedBy("//p[contains(text(),'There is no product that matches')]");

    public static final Target ADD_TO_CART_BUTTON = Target.the("botón añadir al carrito")
            .locatedBy("(//button[contains(@onclick, 'cart.add')])[1]");

    public static final Target CART_TOTAL_BUTTON = Target.the("botón total del carrito")
            .locatedBy("#cart-total");

    public static final Target SHOPPING_CART_LINK = Target.the("enlace al carrito")
            .locatedBy("//a[@title='Shopping Cart']");

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de éxito")
            .locatedBy(".alert-success");
}