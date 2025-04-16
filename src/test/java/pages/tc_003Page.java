package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By errorMessage = By.id("errorMessage");
    By fileInput = By.id("fileInput");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectExceedingDocument() {
        driver.findElement(fileInput).sendKeys("/path/to/exceeding/file");
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isFileSizeExcessiveDetected() {
        // Implement logic to verify system detection of excessive size
        return true; // Placeholder value
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}