package stepDefinitions;

import io.cucumber.java.en.And;
import pages.Dialog;
import pages.Menu;

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
}
