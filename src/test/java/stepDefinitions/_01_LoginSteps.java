package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Dialog;
import pages.Menu;
import utilities.DriverClass;

import java.time.Duration;

public class _01_LoginSteps {
    Dialog dialog = new Dialog();
    Menu menu = new Menu();
    WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(), Duration.ofSeconds(10));
    @Given("Navigate to Campus Web Site")
    public void navigate_to_campus_web_site() {
        //System.out.println("Navigating to Campus");
        DriverClass.getDriver().get("https://test.mersys.io/");
    }
    @Given("Enter username and password")
    public void enter_username_and_password() {
        //System.out.println("Entering username and password");
        //wait.until(ExpectedConditions.visibilityOf(dialog.username));
        dialog.waitUntilVisible(dialog.username);
        dialog.username.sendKeys("turkeyts");
        dialog.password.sendKeys("TechnoStudy123");
    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        //System.out.println("Clicking on Login Button");
        dialog.loginButton.click();
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        //System.out.println("User is logged in");
        //wait.until(ExpectedConditions.visibilityOf(menu.dashBoardTitle));
        menu.waitUntilVisible(menu.dashBoardTitle);
        Assert.assertTrue(menu.dashBoardTitle.isDisplayed());
    }
}
