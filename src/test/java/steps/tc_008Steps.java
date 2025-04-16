import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver = new ChromeDriver();
    tc_008Page uploadPage = new tc_008Page(driver);

    @Given("the document upload is started")
    public void the_document_upload_is_started() {
        uploadPage.startDocumentUpload();
    }

    @When("there is a connection interruption")
    public void there_is_a_connection_interruption() {
        uploadPage.simulateConnectionInterruption();
    }

    @Then("the system detects the interruption and notifies the user")
    public void the_system_detects_the_interruption_and_notifies_the_user() {
        uploadPage.verifyInterruptionNotification();
    }

    @When("the upload is restarted")
    public void the_upload_is_restarted() {
        uploadPage.restartUpload();
    }

    @Then("the system allows upload resumption without restarting the full process")
    public void the_system_allows_upload_resumption_without_restarting_the_full_process() {
        uploadPage.verifyUploadResumption();
    }
}