package e2e;

import baseClass.*;
import modules.LoginHotel;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static baseClass.SeleniumMethods.*;
import static modules.SearchHotel.*;

public class SearchHotel extends driver.Browser{

    public Configuration config = ConfigFactory.create(Configuration.class);

    @Test
    public void Login(){

        maximizeWindow();
        LoginHotel.loginWithCorrectUsernameAndPassword(config.userName(),config.password());

    }

    @Test
    public void TC_01_search_hotel_required_field() throws InterruptedException {

        validateRequiredField();
        clickResetButton();
        Thread.sleep(2000);
        validateRequiredField();
        clickSearchButton();
        Thread.sleep(2000);
    }
}