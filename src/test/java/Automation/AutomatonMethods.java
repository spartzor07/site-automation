package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomatonMethods extends BaseClass {

    public AutomatonMethods(WebDriver driver){
        super(driver);
    }
    //Click Method
    public void click (By element){
        driver.findElement(element).click();
    }
    //Write Text
    public void writeText (By element, String text) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(element).sendKeys(text);
    }

}
