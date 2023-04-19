package driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Browser {
    public static WebDriver driver;

    public static void openBrowser(String browserName, String url) {
        switch (browserName) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(chromeOptions);
                break;

            case "fireFox":
                FirefoxOptions ffOptions = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(ffOptions);
                break;

            case "safari":
                SafariOptions safariOptions = new SafariOptions();
                driver = new SafariDriver(safariOptions);
                break;

            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
        }

        driver.get(url);

    }

    public static void crossBrowser(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(chromeOptions);

        } else if (browser.equalsIgnoreCase("firefox")) {

            FirefoxOptions ffOptions = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(ffOptions);

        } else if (browser.equalsIgnoreCase("safari")) {

            SafariOptions safariOptions = new SafariOptions();
            driver = new SafariDriver(safariOptions);
        }

        driver.get(url);
    }
}