package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;

public class Dialog {

    public Dialog(){
        PageFactory.initElements(DriverClass.getDriver(),this);
    }

    @FindBy(css = "input[placeholder=\"Username\"]")
    public WebElement username;

    @FindBy(css = "input[placeholder=\"Password\"]")
    public WebElement password;

    @FindBy(xpath = "//span[normalize-space()=\"LOGIN\"]")
    public WebElement loginButton;
}
