package Test;

import Automation.AutomationTool;

import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegisterTest extends AutomationTool{

    @Test
    public void registerTest() {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.registrationPage();
    }
}