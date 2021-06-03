package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AutomatonMethods {

    public HomePage (WebDriver driver) {
        super(driver);
    }
    By login = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a");
    By registerButton = By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[7]/a");
    public HomePage homePage (){
        driver.get(getUrl());
        return this;
    }
    public LoginPage loginClick () {
        click(login);
        return new LoginPage(driver);
    }
    public RegistrationPage registerClick () {
        click(registerButton);
        return new RegistrationPage(driver);
    }
}
