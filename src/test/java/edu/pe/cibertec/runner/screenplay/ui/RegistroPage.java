package edu.pe.cibertec.runner.screenplay.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;




public class RegistroPage {

    public static final Target FIRST_NAME = Target.the("nombre").located(By.id("input-firstname"));
    public static final Target LAST_NAME = Target.the("apellido").located(By.id("input-lastname"));
    public static final Target EMAIL = Target.the("email").located(By.id("input-email"));
    public static final Target TELEPHONE = Target.the("telefono").located(By.id("input-telephone"));
    public static final Target PASSWORD = Target.the("password").located(By.id("input-password"));
    public static final Target CONFIRM_PASSWORD = Target.the("confirmar").located(By.id("input-confirm"));
    public static final Target PRIVACY_POLICY = Target.the("check privacidad").located(By.name("agree"));
    public static final Target CONTINUE_BUTTON = Target.the("boton continuar").located(By.xpath("//input[@value='Continue']"));
    public static final Target SUCCESS_MESSAGE = Target.the("mensaje exito").located(By.xpath("//div[@id='content']/h1"));
}
