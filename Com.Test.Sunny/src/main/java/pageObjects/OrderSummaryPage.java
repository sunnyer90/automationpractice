package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
    public WebDriver driver;

    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    WebElement signInButton;

    public OrderSummaryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSignInButton(){
        return signInButton;
    }
}
