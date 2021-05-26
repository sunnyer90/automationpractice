package conf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeWebDriver() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream(".//src//main//java//conf//conf.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);
        } else if(browserName.equals("firefox")){
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browserName.equals("ie")){
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
