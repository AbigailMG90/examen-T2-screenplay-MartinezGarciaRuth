package edu.pe.cibertec.runner.screenplay.stepdefinitions;

import edu.pe.cibertec.runner.screenplay.tasks.AgregarAlCarrito;
import edu.pe.cibertec.runner.screenplay.ui.CarritoPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import java.time.Duration;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class CarritoStepDefinitions {
    @When("the user adds the product {string} to the cart")
    public void addProduct(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.elProducto()
        );
    }

    @Then("the cart should show {string}")
    public void verifyCartTotal(String expectedTotal) {
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
        OnStage.theActorInTheSpotlight().should(
                seeThat(Text.of(CarritoPage.CART_TOTAL_BUTTON), containsString(expectedTotal))
        );
    }
    @When("navigates to the cart")
    public void navigatesToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(CarritoPage.SHOPPING_CART_LINK)
        );
    }

    @Then("the user should see the product {string} in the cart list")
    public void verifyProductInList(String productName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Text.of(".table-responsive"), containsString(productName))
        );
    }
}