package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc_002Page {
    WebDriver driver;

    By fileInput = By.id("fileUpload");
    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFile(String filePath) {
        WebElement fileInputElement = driver.findElement(fileInput);
        fileInputElement.sendKeys(filePath);
    }

    public void verifyFileRejected() {
        WebElement fileInputElement = driver.findElement(fileInput);
        Assert.assertTrue(fileInputElement.getAttribute("value").isEmpty());
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void verifyUnsupportedFormatMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        Assert.assertEquals("Formato no soportado", errorElement.getText());
    }
}