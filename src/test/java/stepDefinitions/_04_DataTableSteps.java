package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class _04_DataTableSteps {
    @Given("Go to the web site")
    public void goToTheWebSite() {
        System.out.println("Going to the web site");
    }

    @And("Fill the form with valid data")
    public void fillTheFormWithValidData(DataTable dataTable) {
        dataTable.asList(String.class);
    }

    @Then("Save the form")
    public void saveTheForm() {
    }
}
