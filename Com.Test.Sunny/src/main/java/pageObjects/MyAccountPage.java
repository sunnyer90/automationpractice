package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    public WebDriver driver;

    @FindBy(xpath="(//a[text() = 'T-shirts'])[2]")
    WebElement tshirtsTab;

    @FindBy(xpath="//img[@title = 'Faded Short Sleeve T-shirts']")
    WebElement tshirtImage;

    @FindBy(xpath="//span[text() = 'Add to cart']")
    WebElement addToCartButton;

    @FindBy(xpath="//a[@title = \"Proceed to checkout\"]")
    WebElement proceedToCheckoutButton;


    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTshirtsTab(){
        return tshirtsTab;
    }

    public WebElement getAddToCartButton(){
        return addToCartButton;
    }

    public WebElement getproceedToCheckoutButton(){
        return proceedToCheckoutButton;
    }

    public WebElement getTshirtImage(){
        return tshirtImage;
    }
}
