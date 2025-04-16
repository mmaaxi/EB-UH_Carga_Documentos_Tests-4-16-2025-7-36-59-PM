package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    By loginButton = By.id("loginButton");
    By uploadFunctionality = By.id("uploadFunctionality");
    By accessDeniedMessage = By.id("accessDeniedMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAsUserWithoutUploadPermissions() {
        // Add logic to log in as a user without permissions
        driver.findElement(loginButton).click();
    }

    public void attemptAccessUploadFunctionality() {
        // Attempt to access the upload functionality
        driver.findElement(uploadFunctionality).click();
    }

    public boolean isAccessDeniedMessageDisplayed() {
        // Check if the access denied message is displayed
        return driver.findElement(accessDeniedMessage).isDisplayed();
    }
}