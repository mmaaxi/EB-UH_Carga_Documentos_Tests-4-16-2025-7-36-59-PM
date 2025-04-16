package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {

    private WebDriver driver;

    private By uploadPageLocator = By.id("uploadPage");
    private By uploadButton = By.id("uploadButton");
    private By uploadIndicator = By.id("uploadIndicator");
    
    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
        uploadElement.sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isInterfaceDisplayedCorrectly() {
        return driver.findElement(uploadPageLocator).isDisplayed();
    }
    
    public boolean areUploadIndicatorsShown() {
        return driver.findElement(uploadIndicator).isDisplayed();
    }
}