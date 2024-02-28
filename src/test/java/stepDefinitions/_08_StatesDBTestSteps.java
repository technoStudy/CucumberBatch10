package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Dialog;
import pages.Menu;

public class _08_StatesDBTestSteps {

    Dialog dialog = new Dialog();
    Menu menu = new Menu();
    @And("Navigate to States Page")
    public void navigateToStatesPage() {
        menu.myClick(menu.setUpButton);
        menu.myClick(menu.parametersButton);
        menu.myClick(menu.statesButton);
    }

    @When("Send {string} as query")
    public void sendAsQuery(String query) {

    }

    @Then("Check if the results from UI are in the database")
    public void checkIfTheResultsFromUIAreInTheDatabase() {
    }
}
