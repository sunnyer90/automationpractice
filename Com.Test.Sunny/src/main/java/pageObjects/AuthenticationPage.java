package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {
    public WebDriver driver;

    @FindBy(xpath="//input[@id = \"email\"]")
    WebElement emailAddressTextbox;

    @FindBy(xpath="//input[@id = \"passwd\"]")
    WebElement passwordTextbox;

    @FindBy(xpath="//button[@id = \"SubmitLogin\"]")
    WebElement signInButton;

    public AuthenticationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getEmailAddressTextbox(){
        return emailAddressTextbox;
    }

    public WebElement getPasswordTextbox(){
        return passwordTextbox;
    }

    public WebElement getSignInButton(){
        return signInButton;
    }
}
