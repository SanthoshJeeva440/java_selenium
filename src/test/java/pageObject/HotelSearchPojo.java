package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearchPojo extends LoginPojo{
    public HotelSearchPojo(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#location")
    private WebElement selectLocation;

    @FindBy(css = "#hotels")
    private WebElement selectHotel;

    @FindBy(css = "#room_type")
    private WebElement selectRoomType;

    @FindBy(id = "room_nos")
    private WebElement selectNosRooms;

    @FindBy(id = "adult_room")
    private WebElement selectAdultRoom;

    @FindBy(id = "child_room")
    private WebElement selectChildRoom;

    @FindBy(css = "[value='Search']")
    private WebElement selectSearchButton;

    @FindBy(css = "[name='Reset']")
    private WebElement resetButton;

    public WebElement getSelectLocation() {
        return selectLocation;
    }

    public WebElement getSelectHotel() {
        return selectHotel;
    }

    public WebElement getSelectRoomType() {
        return selectRoomType;
    }

    public WebElement getSelectNosRooms() {
        return selectNosRooms;
    }

    public WebElement getSelectAdultRoom() {
        return selectAdultRoom;
    }

    public WebElement getSelectChildRoom() {
        return selectChildRoom;
    }

    public WebElement getSelectSearchButton() {
        return selectSearchButton;
    }

    public WebElement getResetButton(){
        return resetButton;
    }
}
