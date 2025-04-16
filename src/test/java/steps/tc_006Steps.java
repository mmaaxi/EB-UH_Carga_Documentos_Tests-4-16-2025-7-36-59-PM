package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page uploadPage = new tc_006Page();

    @Given("^the user has a valid document to upload$")
    public void userHasValidDocumentToUpload() {
        uploadPage.prepareValidDocument();
    }
    
    @When("^the user uploads the document$")
    public void userUploadsDocument() {
        uploadPage.uploadDocument();
    }

    @Then("^the document should be stored correctly in the database$")
    public void documentStoredInDatabase() {
        uploadPage.verifyDocumentStorageInDatabase();
    }
    
    @When("^the user checks the database entry for the document$")
    public void userChecksDatabaseEntry() {
        uploadPage.checkDatabaseForDocumentEntry();
    }

    @Then("^the database should reflect the correct document information$")
    public void databaseReflectsCorrectDocumentInformation() {
        uploadPage.verifyDatabaseEntry();
    }
}