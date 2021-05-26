package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public WebDriver driver;

    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    @FindBy(xpath="//a[@title = 'Information']")
    WebElement personalInformationButton;

    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSignInButton(){
        return signInButton;
    }

    public WebElement getPersonalInformationButton(){
        return personalInformationButton;
    }

}
