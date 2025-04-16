import org.openqa.selenium.WebDriver;
import pages.Tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class Tc_001Steps {
    private WebDriver driver;
    private Tc_001Page tc_001Page;

    public Tc_001Steps(WebDriver driver) {
        this.driver = driver;
        tc_001Page = new Tc_001Page(driver);
    }

    @Given("El usuario ha seleccionado un documento en formato PDF válido")
    public void seleccionarDocumentoPDFValido() {
        tc_001Page.subirDocumentoPDF("ruta/al/documento.pdf");
        assertTrue(tc_001Page.esNombreArchivoVisible("documento.pdf"));
    }

    @When("El usuario hace clic en el botón 'Cargar'")
    public void hacerClicEnCargar() {
        tc_001Page.clicEnCargar();
    }

    @Then("El documento se carga correctamente y se muestra una confirmación")
    public void verificarCargaCorrectaDelDocumento() {
        assertTrue(tc_001Page.esConfirmacionVisible());
    }
}