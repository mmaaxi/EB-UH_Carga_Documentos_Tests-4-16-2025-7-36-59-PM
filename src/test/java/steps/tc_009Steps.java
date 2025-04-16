package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("el usuario está autenticado en la plataforma")
    public void elUsuarioEstaAutenticadoEnLaPlataforma() {
        page.autenticarUsuario();
    }

    @When("el usuario carga un documento")
    public void elUsuarioCargaUnDocumento() {
        page.cargarDocumento("documentoEjemplo.txt");
    }

    @Then("el documento se guarda en un lugar seguro y encriptado")
    public void elDocumentoSeGuardaEnUnLugarSeguroYEncriptado() {
        Assert.assertTrue(page.esDocumentoEncriptadoYSafe());
    }

    @Given("el usuario no tiene permisos adecuados para el documento")
    public void elUsuarioNoTienePermisosAdecuadosParaElDocumento() {
        page.establecerPermisosUsuario(false);
    }

    @When("el usuario intenta acceder al documento")
    public void elUsuarioIntentaAccederAlDocumento() {
        page.accederDocumento();
    }

    @Then("el acceso al documento es denegado, mostrando mensaje de seguridad")
    public void elAccesoAlDocumentoEsDenegadoMostrandoMensajeDeSeguridad() {
        Assert.assertTrue(page.mostrarMensajeDenegacionAcceso());
    }
}