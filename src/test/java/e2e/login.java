package e2e;
import baseClass.Configuration;
import baseClass.SeleniumMethods;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;
import modules.LoginHotel;
public class login extends driver.Browser {
    public  Configuration config = ConfigFactory.create(Configuration.class);

    @Test
    public void login() {

        openBrowser(config.browserName(),config.url());
        SeleniumMethods.maximizeWindow();
        LoginHotel.loginWithCorrectUsernameAndPassword(config.userName(), config.password());
        SeleniumMethods.closeBrowser();
    }
}