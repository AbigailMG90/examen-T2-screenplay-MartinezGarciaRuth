package edu.pe.cibertec.runner.screenplay.stepdefinitions;

import edu.pe.cibertec.runner.screenplay.tasks.IniciarSesion;
import edu.pe.cibertec.runner.screenplay.ui.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinitions {

    @Given("the user navigates to the login page")
    public void navigatesToLoginPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=account/login")
        );
    }

    @When("the user enters email {string} and password {string}")
    public void entersCredentials(String email, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(email, password)
        );
    }
    @When("clicks on the login button")
    public void clicksOnLoginButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    @Then("the user should see the name {string} in the page header")
    public void verifyHeader(String name) {
        OnStage.theActorInTheSpotlight().attemptsTo(

                net.serenitybdd.screenplay.waits.WaitUntil.the(LoginPage.ACCOUNT_HEADER,
                                net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText("My Account"))
                        .forNoMoreThan(10).seconds()
        );
    }
}