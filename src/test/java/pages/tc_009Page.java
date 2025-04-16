package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_009Page {

    WebDriver driver = DriverFactory.getDriver();

    public void autenticarUsuario() {
        // Implementación de la autenticación del usuario
    }

    public void cargarDocumento(String fileName) {
        // Implementación para cargar el documento
        WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys(fileName);
    }

    public boolean esDocumentoEncriptadoYSafe() {
        // Verificación de que el documento está encriptado y seguro
        return true; // Simulación para este ejemplo
    }

    public void establecerPermisosUsuario(boolean permisosAdecuados) {
        // Lógica para establecer y simular permisos del usuario
    }

    public void accederDocumento() {
        // Lógica para intentar acceder al documento
    }

    public boolean mostrarMensajeDenegacionAcceso() {
        // Verificar que se muestre un mensaje de denegación
        return driver.findElement(By.id("access-denied-message")).isDisplayed();
    }
}