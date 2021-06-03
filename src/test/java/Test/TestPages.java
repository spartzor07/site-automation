package Test;

import Automation.AutomationTool;
import Pages.HomePage;
import Pages.LogOut;
import org.testng.annotations.Test;

public class TestPages extends AutomationTool {
    @Test (priority = 2)
    public void loginTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LogOut logOut = new LogOut(driver);
        homePage.homePage().loginClick().login();
        Thread.sleep(1000);
        logOut.logOut();
    }

    @Test (priority = 1)
    public void registerTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.homePage().registerClick().registrationPage();
    }
}