package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut extends AutomatonMethods {
    public LogOut(WebDriver driver){
        super(driver);
    }
    By menu = By.xpath("//*[@id=\"profile__dropdown\"]");
    By logout = By.xpath("//*[@id=\"app__logout\"]");
    public LogOut logOut(){
        click(menu);
        click(logout);
        return this;
    }
}
