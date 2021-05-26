package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {
    public WebDriver driver;

    @FindBy(xpath="//button[@name = 'processAddress']")
    WebElement proceedToCheckoutButton;

    public AddressesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getProceedToCheckoutButton(){
        return proceedToCheckoutButton;
    }
}
