package modules;
import baseClass.SeleniumMethods;
import pageObject.HotelSearchPojo;
public class SearchHotel{

    public static HotelSearchPojo hotel = new HotelSearchPojo();

    public static void validateRequiredField(){
        SeleniumMethods.selectFromListByIndex(hotel.getSelectLocation(),1);
        SeleniumMethods.selectFromListByIndex(hotel.getSelectNosRooms(), 2);
        SeleniumMethods.selectFromListByIndex(hotel.getSelectAdultRoom(), 1);
        SeleniumMethods.selectFromListByIndex(hotel.getSelectChildRoom(), 2);

    }

    public static void clickResetButton(){

        SeleniumMethods.clickElement(hotel.getResetButton());
    }

    public static void clickSearchButton(){

        SeleniumMethods.clickElement(hotel.getSelectSearchButton());
    }
}
