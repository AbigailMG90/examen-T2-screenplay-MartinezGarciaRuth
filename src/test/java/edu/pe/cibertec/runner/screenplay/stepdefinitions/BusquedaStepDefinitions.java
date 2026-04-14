package edu.pe.cibertec.runner.screenplay.stepdefinitions;

import edu.pe.cibertec.runner.screenplay.ui.BusquedaPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class BusquedaStepDefinitions {

    @Given("the user is on the OpenCart home page")
    public void onHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://naveenautomationlabs.com/opencart/"));
    }

    @When("the user searches for the product {string}")
    public void searchesFor(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                edu.pe.cibertec.runner.screenplay.tasks.BuscarProducto.conNombre(product)
        );
    }
    @Then("the user should see at least one result with the name {string}")
    public void seeResults(String product) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(the(By.linkText(product)), isVisible())
        );
    }

}