package driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
    public static WebDriver driver;

    public static void openBrowser(String browserName, String url) {
        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "fireFox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "safari":
                driver = new SafariDriver();

            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();

            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
        }

        driver.get(url);

    }

    public static void crossBrowser(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

                driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("safari")) {

                driver = new SafariDriver();
        }

        driver.get(url);
    }

}