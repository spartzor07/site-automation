package Automation;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {
    protected WebDriver driver;
    protected String email;
    protected String password;
    protected String url;
    protected String name;
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
            name = prop.getProperty("name");
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

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
