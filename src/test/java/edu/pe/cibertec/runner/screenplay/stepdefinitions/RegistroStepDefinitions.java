package edu.pe.cibertec.runner.screenplay.stepdefinitions;
import edu.pe.cibertec.runner.screenplay.ui.LoginPage;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import edu.pe.cibertec.runner.screenplay.tasks.RegistrarseComo;
import edu.pe.cibertec.runner.screenplay.ui.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.CoreMatchers;

public class RegistroStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Ruth"); // Aquí le das nombre a tu actor/actriz
    }


    @When("the user fills the form with first name {string}, last name {string}, email {string}, phone {string} and password {string}")
    public void fillingForm(String first, String last, String email, String phone, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarseComo.conDatos(first, last, email, phone, password)
        );
    }

    @And("accepts the privacy policy")
    public void acceptsThePrivacyPolicy() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroPage.PRIVACY_POLICY)
        );
    }

    @And("clicks on continue")
    public void clicksOnContinue() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(RegistroPage.CONTINUE_BUTTON)
        );
    }

    @Then("the user should see the message {string}")
    public void verifyMessage(String expectedMessage) {
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        OnStage.theActorInTheSpotlight().should(
                seeThat(Text.of("#content"), containsString(expectedMessage))
        );
    }
    @Given("the user navigates to the register page")
    public void navigatesToRegisterPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://naveenautomationlabs.com/opencart/index.php?route=account/register")
        );
    }
}