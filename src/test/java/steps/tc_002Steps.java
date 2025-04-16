package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Given("el usuario está en la pantalla de carga de documentos")
    public void el_usuario_esta_en_la_pantalla_de_carga_de_documentos() {
        driver = new ChromeDriver();
        driver.get("http://example.com/upload");
        page = new tc_002Page(driver);
    }

    @When("el usuario selecciona un documento \".exe\"")
    public void el_usuario_selecciona_un_documento_exe() {
        page.selectFile("path/to/file.exe");
    }

    @Then("el sistema rechaza la selección del archivo")
    public void el_sistema_rechaza_la_seleccion_del_archivo() {
        page.verifyFileRejected();
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        page.clickUploadButton();
    }

    @Then("se muestra un mensaje de error indicando formato no soportado")
    public void se_muestra_un_mensaje_de_error_indicando_formato_no_soportado() {
        page.verifyUnsupportedFormatMessage();
        driver.quit();
    }
}