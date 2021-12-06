package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        try {
            //BROWSER => chrome/firefox
            //HUB_HOST => http://172.21.0.1:4444

            String hub = "172.18.0.1";
            String  browser = System.getProperty("BROWSER") ;
            if(System.getProperty("HUB_HOST") !=null){
                hub = System.getProperty("HUB_HOST");
            }
            if(browser!= null && browser.equalsIgnoreCase("firefox")) {
                driver = new RemoteWebDriver(new URL("http://"+hub+":4444"), new FirefoxOptions());
                System.out.println("*********** Executing tests on FIREFOX:Remote");
            }else if(browser!= null && browser.equalsIgnoreCase("chrome")) {
                driver = new RemoteWebDriver(new URL("http://"+hub+":4444"), new ChromeOptions());
                System.out.println("*********** Executing tests on CHROME:Remote");
            }else {
                WebDriverManager.firefoxdriver();
                driver = new FirefoxDriver();
                System.out.println("*********** Executing tests on CHROME:Local");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
