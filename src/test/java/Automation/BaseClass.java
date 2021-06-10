package Automation;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {
    protected WebDriver driver;
    protected String email;
    protected String password;
    protected String url;
    protected String firstName;
    protected String lastName;
    protected String company;
    protected String address;
    protected String city;
    protected String zip;
    protected String phone;

    protected Properties prop;

    protected BaseClass(WebDriver driver){

        prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Stefan\\Desktop\\Site-Automation\\src\\test\\java\\Configuration\\Config.properties");
            prop.load(fis);

            this.driver = driver;

            email = prop.getProperty("email");
            password = prop.getProperty("password");
            url = prop.getProperty("url");
            firstName = prop.getProperty("firstName");
            lastName = prop.getProperty("lastName");
            company = prop.getProperty("company");
            address = prop.getProperty("address");
            city = prop.getProperty("city");
            zip = prop.getProperty("zip");
            phone = prop.getProperty("phone");

        } catch (Exception e){

            e.printStackTrace();
        }

    }

    protected String getEmail() {
        return email;
    }

    protected String getPassword() {
        return password;
    }

    protected String getUrl() {
        return url;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getCompany() {
        return company;
    }

    protected String getAddress() {
        return address;
    }

    protected String getCity() {
        return city;
    }

    protected String getZip() {
        return zip;
    }

    protected String getPhone() {
        return phone;
    }

}
