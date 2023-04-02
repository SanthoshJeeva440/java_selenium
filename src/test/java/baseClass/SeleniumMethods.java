package baseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumMethods extends driver.Browser {
//    public static WebDriver driver;
    public static Robot robot;
    public static Actions action;
    public static Select select;
    public static JavascriptExecutor js;
    public static void inputText(WebElement locator, String text){
        locator.sendKeys(text);
    }

    public static void clearElementText(WebElement locator){
        locator.clear();
    }

    public static void clickElement(WebElement locator){
        locator.click();
    }

    public static void doubleClickElement(WebElement locator){
        action = new Actions(driver);
        action.doubleClick(locator).perform();
    }

    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public static void minimizeWindow(){
        driver.manage().window().minimize();
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void closeAllBrowser(){
        driver.quit();
    }

    public static void deleteAllCookies(){
        driver.manage().deleteAllCookies();
    }

    public static void dragAndDrop(WebElement source, WebElement destination){
        action = new Actions(driver);
        action.dragAndDrop(source,destination).perform();
    }

    public static void mouseOver(WebElement locator){
        action = new Actions(driver);
        action.moveToElement(locator).perform();
    }

    public static void mouseClickAndHold(WebElement locator){
        action = new Actions(driver);
        action.clickAndHold(locator).perform();
    }

    public static  void mouseClickAndRelease(WebElement locator){
        action = new Actions(driver);
        action.click(locator).perform();
    }

    public static void scrollIntoView(WebElement locator){
        js.executeScript("arguments[0].scrollIntoView();",locator);
    }

    public static void pageDown(){
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }

    public static void pageUp(){
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_UP).build().perform();
    }

    public static String getText(WebElement locator){
        String text =locator.getText();
        return text;
    }

    public static String getValue(WebElement locator, String attribute){
        String value = locator.getAttribute(attribute);
        return value;
    }

    public static String getTitle(){
        String title = driver.getTitle();
        return title;
    }

    public static void windowSize(){
        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();
        System.out.println("size :"+height+" x "+width);
    }

    public static void pressKey(String keys){
        String enterKey="KeyEvent"+keys;
        robot.keyPress(Integer.parseInt(enterKey));
    }

    public static void selectFrame(WebElement locator){
        driver.switchTo().frame(locator);
    }

    public static void selectFrameByIndex(int index){
        driver.switchTo().frame(index);
    }

    public static void unSelectFrame(){
        driver.switchTo().defaultContent();
    }

    public static void selectByVisibleText(WebElement locator, String text){
        select = new Select(driver.findElement((By) locator));
        select.selectByVisibleText(text);
    }

    public static void switchWindow(int position){
         Set<String> allWindows=driver.getWindowHandles();
         List<String> newWindow= new ArrayList();
         newWindow.addAll(allWindows);
         driver.switchTo().window(newWindow.get(position));
    }

    public static void selectFromListByIndex(WebElement locator, int index){
        select = new Select(locator);
        select.selectByIndex(index);
    }

    public static void selectFromListByLabel(WebElement locator, String value){
        select = new Select(locator);
        select.selectByValue(value);
    }
}