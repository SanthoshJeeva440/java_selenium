package modules;
import baseClass.*;
import pageObject.HotelSearchPojo;

public class LoginHotel extends pageObject.HotelSearchPojo{
    public static HotelSearchPojo hotel = new HotelSearchPojo();

    public static void loginWithCorrectUsernameAndPassword(String username, String Password){

        SeleniumMethods.inputText(hotel.getUserName(),username);
        SeleniumMethods.inputText(hotel.getPassword(), Password);
        SeleniumMethods.clickElement(hotel.getLoginButton());
    }
}
