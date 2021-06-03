package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AutomatonMethods {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By username = By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[1]/input");
    By password = By.xpath("//*[@id=\"userpassword\"]");
    By loginButton = By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[3]/button");

    public void login () throws InterruptedException {
        writeText(username,getEmail());
        writeText(password, getPassword());
        click(loginButton);
    }
}
