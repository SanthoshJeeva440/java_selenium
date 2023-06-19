package pageObject;

import org.openqa.selenium.support.PageFactory;

public class PageObjectManager extends driver.Browser{

    /* this file is used for initialized all page object file
    with page factory model */

    // this file used for avoid Session invalid id
    public static void initElements(){

        PageFactory.initElements(driver, LoginPojo.getLoginInstance());
        PageFactory.initElements(driver, HotelSearchPojo.getHotelSearchInstance());
    }
}