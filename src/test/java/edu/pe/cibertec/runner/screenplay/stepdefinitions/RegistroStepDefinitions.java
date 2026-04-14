package edu.pe.cibertec.runner.screenplay.stepdefinitions;

import edu.pe.cibertec.runner.screenplay.tasks.RegistrarseComo;
import edu.pe.cibertec.runner.screenplay.ui.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;



public class RegistroStepDefinitions {

    @When("the user fills the form with first name {string}, last name {string}, email {string}, phone {string} and password {string}")
    public void fillingForm(String first, String last, String email, String phone, String password) {
        // RECUERDA: Aquí el profe quiere ver tus datos reales
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrarseComo.conDatos("Ruth Abigail", "Martinez Garcia", "i2023127774@cibertec.edu.pe", "924774546", "Test@12345")
        );
    }

    @And("accepts the privacy policy")
    public void acceptsPrivacy() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(RegistroPage.PRIVACY_POLICY));
    }

    @And("clicks on continue")
    public void clicksContinue() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(RegistroPage.CONTINUE_BUTTON));
    }

    @Then("the user should see the message {string}")
    public void verifyMessage(String message) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(RegistroPage.SUCCESS_MESSAGE),
                        is(equalTo(message)))
        );
    }
}