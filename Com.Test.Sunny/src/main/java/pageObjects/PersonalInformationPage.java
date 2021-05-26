package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage {

    public WebDriver driver;

    @FindBy(xpath="//input[@id = 'firstname']")
    WebElement firstNameTextbox;

    @FindBy(xpath="//input[@id = 'old_passwd']")
    WebElement oldPasswordTextbox;

    @FindBy(xpath="//button[@name = 'submitIdentity']")
    WebElement saveButton;

    public PersonalInformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFirstNameTextbox(){
        return firstNameTextbox;
    }

    public WebElement getOldPasswordTextbox(){
        return oldPasswordTextbox;
    }

    public WebElement getSaveButton(){
        return saveButton;
    }
}
