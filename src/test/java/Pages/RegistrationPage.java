package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class RegistrationPage extends AutomatonMethods {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public RegistrationPage registrationPage() {

        try {
            driver.get(getUrl());

            WebElement singIn = waitVisibility(driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
            clickOn(singIn);

            WebElement emailReg = (driver.findElement(By.xpath("//*[@id=\"email_create\"]")));
            emailReg.sendKeys("spartzr07@gmail.com");

            WebElement createAccount = (driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")));
            createAccount.click();

            WebElement checkBox = waitVisibility(driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")));
            clickOn(checkBox);

            WebElement firstNameCostumer = waitVisibility(driver.findElement(By.name("//*[@id=\"customer_firstname\"]")));
            writeText(firstNameCostumer, getFirstName());

            WebElement lastNameCostumer = waitVisibility(driver.findElement(By.name("customer_lastname")));
            writeText(lastNameCostumer, getLastName());

            WebElement email = (driver.findElement(By.xpath("//*[@id=\"email\"]")));
            writeText(email, "spartzr07@gmail.com");

            WebElement password = (driver.findElement(By.name("passwd")));
            writeText(password, getPassword());

            new Select(driver.findElement(By.xpath("//*[@id=\"days\"]"))).selectByValue("4");
            new Select(driver.findElement(By.xpath("//*[@id=\"months\"]"))).selectByValue("7");
            new Select(driver.findElement(By.xpath("//*[@id=\"years\"]"))).selectByValue("1994");

            WebElement firstName = (driver.findElement(By.name("firstname")));
            writeText(firstName, getFirstName());

            WebElement lastName = (driver.findElement(By.name("lastname")));
            writeText(lastName, getLastName());

            WebElement company = (driver.findElement(By.name("company")));
            writeText(company, getCompany());

            WebElement address = (driver.findElement(By.name("address1")));
            writeText(address, getAddress());

            WebElement city = (driver.findElement(By.name("city")));
            writeText(city, getCity());

            new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]"))).selectByValue("4");

            WebElement zip = (driver.findElement(By.xpath("//*[@id=\"postcode\"]")));
            writeText(zip, getZip());

            new Select(driver.findElement(By.xpath("//*[@id=\"id_country\"]"))).selectByValue("21");

            WebElement phone = (driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]")));
            writeText(phone, getPhone());

            WebElement registerUp = (driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")));
            clickOn(registerUp);

            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
            Assert.assertEquals(actualUrl,expectedUrl);

            return this;

        }catch (Exception e){

            System.out.println("Error: "+e.getMessage());
            return null;
        }

    }
}
