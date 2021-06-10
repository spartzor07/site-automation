package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends AutomatonMethods {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage login (){

        try {
            driver.get(getUrl());

            WebElement singIn = waitVisibility(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
            clickOn(singIn);

            WebElement email = waitVisibility(driver.findElement(By.xpath("//*[@id=\"email\"]")));
            writeText(email,getEmail());

            WebElement password = waitVisibility(driver.findElement(By.xpath("//*[@id=\"passwd\"]")));
            writeText(password,getPassword());

            WebElement login = waitVisibility(driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")));
            clickOn(login);

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "http://automationpractice.com/index.php?controller=my-account";

            Assert.assertEquals(actualUrl,expectedUrl);

            return this;

        }catch (Exception e){

            Reporter.log("Error: "+ e.getMessage());
            return null;
        }
    }

}
