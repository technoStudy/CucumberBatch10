package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

import java.util.List;

public class Dialog extends MyMethods {

    public Dialog(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(css = "input[placeholder=\"Username\"]")
    public WebElement username;

    @FindBy(css = "input[placeholder=\"Password\"]")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()=\"LOGIN\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[text()=\"Cannot read properties of null (reading 'lang')\"]")
    public List<WebElement> errorMessages;

    @FindBy(css = "ms-add-button[class=\"ng-star-inserted\"]")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder=\"Name\"])[2]")
    public WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder=\"Code\"])[2]")
    public WebElement formCodeInput;

    @FindBy(xpath = "//span[text()=\"Save\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "(//input[@data-placeholder=\"Name\"])[1]")
    public WebElement searchNameInput;

    @FindBy(xpath = "//span[text()=\"Search\"]")
    public WebElement searchButton;

    @FindBy(css = "ms-edit-button[class=\"ng-star-inserted\"]")
    public WebElement editButton;

    @FindBy(css = "ms-delete-button[class=\"ng-star-inserted\"]")
    public WebElement deleteButton;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "(//input[@data-placeholder=\"Short Name\"])[2]")
    public WebElement citizenshipFormShortNameInput;



}
