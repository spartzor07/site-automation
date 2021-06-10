package Test;

import Automation.AutomationTool;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends AutomationTool {

    @Test
    public void loginTest(){

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }
}
