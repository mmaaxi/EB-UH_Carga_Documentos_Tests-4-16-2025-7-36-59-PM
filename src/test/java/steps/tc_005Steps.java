package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_005Page;
import static org.junit.Assert.*;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page;

    public tc_005Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_005Page.class);
    }

    @Given("^el usuario inicia sesión sin permisos de carga$")
    public void usuarioSinPermisosDeCarga() {
        page.loginAsUserWithoutUploadPermissions();
    }

    @When("^intenta acceder a la funcionalidad de carga$")
    public void accederFuncionalidadCarga() {
        page.attemptAccessUploadFunctionality();
    }

    @Then("^se muestra un mensaje de error o acceso denegado$")
    public void muestraMensajeDeError() {
        assertTrue(page.isAccessDeniedMessageDisplayed());
    }
}