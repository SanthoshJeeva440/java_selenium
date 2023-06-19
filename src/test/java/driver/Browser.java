package driver;

import baseClass.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.*;

public class Browser {
    public static WebDriver driver;

    // Chrome Driver Options
    static void chromeDriverOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }

    // Firefox Driver Options
    static void firefoxDriverOptions() {
        FirefoxOptions ffOptions = new FirefoxOptions();
        driver = new FirefoxDriver(ffOptions);
    }

    // Safari Driver Options
    static void safariDriverOptions() {
        SafariOptions safariOptions = new SafariOptions();
        driver = new SafariDriver(safariOptions);
    }

    // Edge Driver Options
    static void edgeDriverOptions() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    public static Configuration config = ConfigFactory.create(Configuration.class);

    @BeforeClass(alwaysRun = true)
    @Parameters({"browserName", "url"})
    public static void openBrowser(@Optional String browserName, @Optional String url) {
        // condition to assign browser name if its null
        if (browserName == null) {
            browserName = config.browserName();
            url = config.url();
        }
        else {
            url = config.url();
        }
        switch (browserName) {
            case "chrome":
                chromeDriverOptions();
                break;
            case "fireFox":
                firefoxDriverOptions();
                break;
            case "safari":
                safariDriverOptions();
                break;
            case "edge":
                edgeDriverOptions();
                break;
        }
        driver.get(url);
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }
}