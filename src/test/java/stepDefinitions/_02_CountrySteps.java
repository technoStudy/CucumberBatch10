package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Dialog;
import pages.Menu;
import utilities.DriverClass;

import java.time.Duration;

public class _02_CountrySteps {

    Menu menu = new Menu();
    Dialog dialog = new Dialog();

    @And("Navigate to Countries page")
    public void navigateToCountriesPage() {
        menu.myClick(menu.setUpButton);
        menu.myClick(menu.parametersButton);
        menu.myClick(menu.countriesButton);
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dialog.myClick(dialog.addButton);
    }

    @And("Enter country name and country code")
    public void enterCountryNameAndCountryCode() {
        dialog.mySendKeys(dialog.formNameInput, "Batch 10");
        dialog.mySendKeys(dialog.formCodeInput, "BT10");
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        dialog.myClick(dialog.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dialog.waitUntilVisible(dialog.successMessage);
        Assert.assertTrue(dialog.successMessage.isDisplayed());
    }

    @And("Search for the country")
    public void searchForTheCountry() {
        dialog.mySendKeys(dialog.searchNameInput, "Batch 10");
        dialog.myClick(dialog.searchButton);
    }

    @And("Click on edit button")
    public void clickOnEditButton() {
        dialog.waitForNumberOfElementsToBe(By.cssSelector("ms-edit-button[class=\"ng-star-inserted\"]"), 1);
        dialog.myClick(dialog.editButton);
    }

    @And("Change the country code")
    public void changeTheCountryCode() {
        dialog.mySendKeys(dialog.formCodeInput, "BTCH10");
    }

    @And("Click on delete button")
    public void clickOnDeleteButton() {
        dialog.waitForNumberOfElementsToBe(By.cssSelector("ms-delete-button[class=\"ng-star-inserted\"]"),1);
        dialog.myClick(dialog.deleteButton);
    }

    @When("Click on delete confirm")
    public void clickOnDeleteConfirm() {
        dialog.myClick(dialog.deleteConfirmButton);
    }

    @And("Enter {string} as country name and {string} as country code")
    public void enterAsCountryNameAndAsCountryCode(String countryName, String countryCode) {
        dialog.mySendKeys(dialog.formNameInput,countryName);
        dialog.mySendKeys(dialog.formCodeInput, countryCode);
    }


}
