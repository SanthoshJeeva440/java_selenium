package e2e;
import baseClass.Configuration;
import baseClass.SeleniumMethods;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Parameters;
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

//    @Parameters({"browser"})
//    @Test
//    public void crossBrowsingTest(String browser){
//        crossBrowser(browser,new String(config.url()));
//        SeleniumMethods.maximizeWindow();
//        LoginHotel.loginWithCorrectUsernameAndPassword(config.userName(), config.password());
//        SeleniumMethods.closeBrowser();
//    }
}