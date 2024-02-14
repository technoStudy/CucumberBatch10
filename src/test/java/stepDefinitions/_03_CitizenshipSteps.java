package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.Dialog;
import pages.Menu;
import utilities.DriverClass;
import utilities.ExcelUtilities;

import java.util.List;

public class _03_CitizenshipSteps {

    Dialog dialog = new Dialog();
    Menu menu = new Menu();

    @And("Navigate to Citizenships page")
    public void navigateToCitizenshipsPage() {
        menu.myClick(menu.setUpButton);
        menu.myClick(menu.parametersButton);
        menu.myClick(menu.citizenshipsButton);
    }

    @And("Enter {string} and {string}")
    public void enterAnd(String citizenshipName, String citizenshipShortName) {
        dialog.mySendKeys(dialog.formNameInput, citizenshipName);
        dialog.mySendKeys(dialog.citizenshipFormShortNameInput, citizenshipShortName);
    }

    @And("Search for {string}")
    public void searchFor(String citizenshipName) {
        dialog.mySendKeys(dialog.searchNameInput, citizenshipName);
        dialog.myClick(dialog.searchButton);
    }

    @Then("Create a Citizenship by using Apache POI")
    public void createACitizenshipByUsingApachePOI() {
        List<List<String>> citizenshipData = ExcelUtilities.getDataFromExcel("C:\\Users\\ragip\\Desktop\\ApachePOI\\ApacheExcel2.xlsx", "testCitizen");

        for (int i=0; i< citizenshipData.size(); i++){
            dialog.myClick(dialog.addButton);
            dialog.mySendKeys(dialog.formNameInput,citizenshipData.get(i).get(0));
            dialog.mySendKeys(dialog.citizenshipFormShortNameInput,citizenshipData.get(i).get(1));
            dialog.myClick(dialog.saveButton);
            dialog.waitUntilVisible(dialog.successMessage);
            Assert.assertTrue(dialog.successMessage.getText().contains("successfully"));
            dialog.waitUntilInVisible(dialog.successMessage);
        }
    }
}
