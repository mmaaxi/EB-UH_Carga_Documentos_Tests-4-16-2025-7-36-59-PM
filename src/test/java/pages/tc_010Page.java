package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc_010Page {
    private WebDriver driver;
    private By archivoInput = By.id("archivoInput");
    private By mensajeError = By.id("mensajeError");

    public Tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoCorrupto() {
        WebElement uploadElement = driver.findElement(archivoInput);
        uploadElement.sendKeys("/path/to/corrupt/document");
    }

    public void intentarCargarDocumento() {
        WebElement uploadElement = driver.findElement(archivoInput);
        uploadElement.submit();
    }

    public boolean esArchivoCorruptoDetectado() {
        return driver.findElements(mensajeError).size() > 0;
    }

    public boolean esMensajeDeErrorMostrado() {
        WebElement errorElement = driver.findElement(mensajeError);
        return errorElement.isDisplayed() && errorElement.getText().contains("documento está dañado");
    }
}