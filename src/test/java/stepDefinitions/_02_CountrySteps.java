package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Dialog;
import pages.Menu;

public class _02_CountrySteps {

    Menu menu = new Menu();
    Dialog dialog = new Dialog();
    @And("Navigate to Countries page")
    public void navigateToCountriesPage() {
        menu.setUpButton.click();
        menu.parametersButton.click();
        menu.countriesButton.click();
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dialog.addButton.click();
    }

    @And("Enter country name and country code")
    public void enterCountryNameAndCountryCode() {
        dialog.formNameInput.sendKeys("Batch 10");
        dialog.formCodeInput.sendKeys("BT10");
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        dialog.saveButton.click();
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        Assert.assertTrue(dialog.successMessage.isDisplayed());
    }
}
