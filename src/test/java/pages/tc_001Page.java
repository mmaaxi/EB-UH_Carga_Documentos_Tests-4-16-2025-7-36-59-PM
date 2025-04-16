import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tc_001Page {
    private WebDriver driver;
    private By campoCarga = By.id("campoCarga");
    private By botonCargar = By.id("botonCargar");
    private By confirmacionMensaje = By.id("confirmacionMensaje");

    public Tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void subirDocumentoPDF(String rutaArchivo) {
        WebElement input = driver.findElement(campoCarga);
        input.sendKeys(rutaArchivo);
    }

    public boolean esNombreArchivoVisible(String nombreArchivo) {
        WebElement archivoSeleccionado = driver.findElement(By.xpath("//div[text()='" + nombreArchivo + "']"));
        return archivoSeleccionado.isDisplayed();
    }

    public void clicEnCargar() {
        driver.findElement(botonCargar).click();
    }

    public boolean esConfirmacionVisible() {
        return driver.findElement(confirmacionMensaje).isDisplayed();
    }
}