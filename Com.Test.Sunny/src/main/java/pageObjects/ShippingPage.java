package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
    public WebDriver driver;

    @FindBy(xpath="//span/input[@id = 'cgv']")
    WebElement agreementCheckbox;

    @FindBy(xpath="//button[@name = 'processCarrier']")
    WebElement proceedToCheckoutButton;

    public ShippingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getAgreementCheckbox(){
        return agreementCheckbox;
    }

    public WebElement getProceedToCheckoutButton(){
        return proceedToCheckoutButton;
    }
}
