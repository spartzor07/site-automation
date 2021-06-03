package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends AutomatonMethods {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By name = By.name("name");
    By email = By.name("email");
    By password = By.name("password");
    By phone = By.name("phone");
    By checkBox = By.xpath("//*[@id=\"signup-form\"]/div[5]/label/samp");
    By registerUp = By.xpath("//*[@id=\"signup-form\"]/div[6]/button");

    public void registrationPage() throws InterruptedException {
        writeText(name, getName());
        writeText(email, getEmail());
        writeText(password, getPassword());
        writeText(phone, getPhone());
        click(checkBox);
        click(registerUp);
    }
}
