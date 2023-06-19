package modules;
import baseClass.SeleniumMethods;
import pageObject.HotelSearchPojo;
import pageObject.PageObjectManager;

public class SearchHotel{

//    public static HotelSearchPojo hotel = new HotelSearchPojo();

    public static void validateRequiredField(){

        PageObjectManager.initElements();
        SeleniumMethods.selectFromListByIndex(HotelSearchPojo.getHotelSearchInstance().getSelectLocation(),1);
        SeleniumMethods.selectFromListByIndex(HotelSearchPojo.getHotelSearchInstance().getSelectNosRooms(), 2);
        SeleniumMethods.selectFromListByIndex(HotelSearchPojo.getHotelSearchInstance().getSelectAdultRoom(), 1);
        SeleniumMethods.selectFromListByIndex(HotelSearchPojo.getHotelSearchInstance().getSelectChildRoom(), 2);

    }

    public static void clickResetButton(){


        SeleniumMethods.clickElement(HotelSearchPojo.getHotelSearchInstance().getResetButton());
    }

    public static void clickSearchButton(){


        SeleniumMethods.clickElement(HotelSearchPojo.getHotelSearchInstance().getSelectSearchButton());
    }
}
