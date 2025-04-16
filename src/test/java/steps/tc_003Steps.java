package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_003Page;
import static org.junit.Assert.assertTrue;

public class tc_003Steps {

    WebDriver driver = new ChromeDriver();
    tc_003Page page = new tc_003Page(driver);

    @Given("a document is selected that exceeds the maximum allowed size")
    public void select_exceeding_document() {
        page.navigateToUploadPage();
        page.selectExceedingDocument();
    }

    @When("the user attempts to upload the document")
    public void attempt_to_upload_document() {
        page.clickUploadButton();
    }

    @Then("the system should detect that the file size is excessive")
    public void verify_file_size_excessive() {
        assertTrue(page.isFileSizeExcessiveDetected());
    }

    @And("display an error message indicating the file exceeds the allowed size")
    public void verify_error_message_displayed() {
        assertTrue(page.isErrorMessageDisplayed());
        driver.quit();
    }
}