package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page uploadPage = new tc_007Page();

    @Given("I have selected multiple documents of varying sizes")
    public void i_have_selected_multiple_documents_of_varying_sizes() {
        uploadPage.selectMultipleDocuments();
    }

    @When("I start the upload and measure the response time")
    public void i_start_the_upload_and_measure_the_response_time() {
        uploadPage.initiateUpload();
    }

    @Then("the system accepts multiple uploads in parallel")
    public void the_system_accepts_multiple_uploads_in_parallel() {
        Assert.assertTrue(uploadPage.isParallelUploadSupported());
    }
    
    @Then("the system processes the uploads in a reasonable time without performance degradation")
    public void the_system_processes_the_uploads_in_a_reasonable_time_without_performance_degradation() {
        Assert.assertTrue(uploadPage.isPerformanceWithinLimits());
    }
}