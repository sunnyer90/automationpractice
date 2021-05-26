package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummaryPage {

    public WebDriver driver;

    @FindBy(xpath="(//a[@title = 'Proceed to checkout'])[2]")
    WebElement proceedToCheckoutButton;

    public ShoppingCartSummaryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getProceedToCheckoutButton(){
        return proceedToCheckoutButton;
    }
}
