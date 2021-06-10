package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutomatonMethods extends BaseClass {

    public WebDriverWait wait;

    public AutomatonMethods(WebDriver driver){
        super(driver);
        wait = new WebDriverWait(driver, 10);
    }


    //Wait Wrapper Method
    public WebElement waitVisibility(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(element));
            return element;
        }catch (Exception e){
            System.out.println("Error wait:"+e.getMessage());
            return null;
        }
    }

    //Click Method
    public void clickOn (WebElement element){
        try {
            waitVisibility(element);
            element.click();
        }catch (Exception e){
            System.out.println("Error Click: "+e.getMessage());
        }
    }

    //Write Text
    public void writeText (WebElement element, String text) {
        try {
            waitVisibility(element);
            element.sendKeys(text);
        }catch (Exception e){
            System.out.println("Error write: "+e.getMessage());
        }
    }

    //Hover
    public void hover (WebElement element) {
        waitVisibility(element);
        try {
            Actions action = new Actions(driver);
            waitVisibility(element);
            action.moveToElement(element).perform();
        }catch (Exception e){
            System.out.println("Error hover: "+e.getMessage());
        }

    }

    //Slider
    public void slider (WebElement element) {
        waitVisibility(element);
        try {
            Actions action = new Actions(driver);
            waitVisibility(element);
            action.dragAndDropBy(element,-100, 0).click().build().perform();
        }catch (Exception e){
            System.out.println("Error hover: "+e.getMessage());
        }
    }

    //Get text
    public String getText (WebElement element){
        try {
            waitVisibility(element);
            return element.getText();
        }catch (Exception e){
            System.out.println("Error get: "+e.getMessage());
        }
        return null;
    }

    //Assert
    public void assertEquals (WebElement element, String expectedText) {
        waitVisibility(element);
        Assert.assertEquals(getText(element), expectedText);
    }
}
