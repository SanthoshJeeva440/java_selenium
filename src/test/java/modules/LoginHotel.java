package modules;
import baseClass.*;
import pageObject.HotelSearchPojo;
import pageObject.LoginPojo;
import pageObject.PageObjectManager;

public class LoginHotel extends pageObject.HotelSearchPojo{
//    public static HotelSearchPojo hotel = new HotelSearchPojo();

    public static void loginWithCorrectUsernameAndPassword(String username, String Password){

        PageObjectManager.initElements();
        SeleniumMethods.inputText(LoginPojo.getLoginInstance().getUserName(),username);
        SeleniumMethods.inputText(LoginPojo.getLoginInstance().getPassword(), Password);
        SeleniumMethods.clickElement(LoginPojo.getLoginInstance().getLoginButton());
    }
}
