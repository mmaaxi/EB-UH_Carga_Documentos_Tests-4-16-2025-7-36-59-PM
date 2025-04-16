package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;
import utils.DriverFactory;

public class tc_004Steps {

    private WebDriver driver;
    private tc_004Page uploadPage;

    public tc_004Steps() {
        this.driver = DriverFactory.getDriver();
        this.uploadPage = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("the user navigates to the document upload page")
    public void navigateToUploadPage() {
        uploadPage.goToUploadPage();
    }
    
    @When("a test document is uploaded")
    public void uploadTestDocument() {
        uploadPage.uploadDocument("path/to/test/document.pdf");
    }
    
    @Then("the interface should display correctly and intuitive")
    public void validateInterfaceDisplay() {
        Assert.assertTrue("Interface is not displayed correctly", uploadPage.isInterfaceDisplayedCorrectly());
    }
    
    @Then("visual indicators of the upload process should be shown")
    public void validateUploadIndicators() {
        Assert.assertTrue("Upload indicators are not shown", uploadPage.areUploadIndicatorsShown());
    }
}