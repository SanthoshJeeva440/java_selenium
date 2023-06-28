package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPojo{

    public static LoginPojo loginInstance;

    public LoginPojo(){

    }
    // page object achieved by single design pattern
    public static LoginPojo getLoginInstance(){

        if(loginInstance == null){
            loginInstance = new LoginPojo();
        }
        return loginInstance;

    }
    @FindBy(id = "username")
    private WebElement userName;

    @FindAll({
            @FindBy(id="password"),
            @FindBy(name = "password")
    })
   private WebElement password;
    @FindAll({
            @FindBy(css = "#login"),
            @FindBy(name = "login"),
            @FindBy(className = "login_button")

    })
    private WebElement loginButton;

    public WebElement getUserName() {
        return userName;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

}
