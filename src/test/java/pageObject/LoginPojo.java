package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends driver.Browser{

    public LoginPojo(){
        PageFactory.initElements(driver, this);
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
