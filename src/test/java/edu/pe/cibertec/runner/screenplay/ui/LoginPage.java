package edu.pe.cibertec.runner.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_FIELD = Target.the("campo email").located(By.id("input-email"));
    public static final Target PASSWORD_FIELD = Target.the("campo password").located(By.id("input-password"));
    public static final Target LOGIN_BUTTON = Target.the("botón login").located(By.xpath("//input[@value='Login']"));
    public static final Target NO_RESULTS_MESSAGE = Target.the("mensaje de no resultados").locatedBy("//p[contains(text(),'There is no product that matches')]");
    public static final Target ACCOUNT_HEADER = Target.the("título de cuenta").located(By.xpath("//h2[contains(.,'My Account')]"));



}