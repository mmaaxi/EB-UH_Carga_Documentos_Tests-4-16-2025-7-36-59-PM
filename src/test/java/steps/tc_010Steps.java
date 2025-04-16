package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import pages.Tc_010Page;

public class Tc_010Steps {
    Tc_010Page tc_010Page = new Tc_010Page();

    @Dado("que el usuario selecciona un documento corrupto")
    public void que_el_usuario_selecciona_un_documento_corrupto() {
        tc_010Page.seleccionarDocumentoCorrupto();
    }

    @Cuando("el usuario intenta cargar el documento")
    public void el_usuario_intenta_cargar_el_documento() {
        tc_010Page.intentarCargarDocumento();
    }

    @Entonces("el sistema detecta la corrupción del archivo")
    public void el_sistema_detecta_la_corrupcion_del_archivo() {
        Assert.assertTrue(tc_010Page.esArchivoCorruptoDetectado());
    }

    @Entonces("se muestra un mensaje de error indicando que el documento está dañado")
    public void se_muestra_un_mensaje_de_error_indicando_que_el_documento_esta_da_ado() {
        Assert.assertTrue(tc_010Page.esMensajeDeErrorMostrado());
    }
}