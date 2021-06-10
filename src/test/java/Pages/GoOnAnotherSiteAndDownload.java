package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class GoOnAnotherSiteAndDownload extends AutomatonMethods {

    public GoOnAnotherSiteAndDownload(WebDriver driver) {
        super(driver);
    }


    public GoOnAnotherSiteAndDownload goOnAnotherSite(){

     try {
         driver.get(getUrl());

         WebElement slika1 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"homepage-slider\"]/div/div[1]")));
         clickOn(slika1);

         WebElement productsHover = waitVisibility(driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[1]/ul/li[1]")));
         hover(productsHover);

         WebElement prestaShop = waitVisibility(driver.findElement(By.xpath("//*[@id=\"header-menu\"]/div[3]/div/div[1]/div[3]/div/div[1]/a")));
         clickOn(prestaShop);

         new Select(driver.findElement(By.xpath("//*[@id=\"edit-submitted-type\"]"))).selectByValue("merchant");

         WebElement email = driver.findElement(By.xpath("//*[@id=\"edit-submitted-email\"]"));
         writeText(email,getEmail());

         WebElement termOfUse1 = driver.findElement(By.xpath("//*[@id=\"edit-submitted-termsconditions\"]/div/label"));
         clickOn(termOfUse1);

         WebElement termOfUse2 = driver.findElement(By.xpath("//*[@id=\"edit-submitted-conditions\"]/div/label"));
         clickOn(termOfUse2);

         WebElement downloadButton = driver.findElement(By.xpath("//*[@id=\"webform-client-form-501\"]/div/div[8]/input"));
         clickOn(downloadButton);

         //Waiting for file to be downloaded, will NOT download if file is already there
         File file = new File("C:\\Users\\Stefan\\Downloads\\prestashop_1.7.7.4.zip");
         FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(25)).pollingEvery(Duration.ofMillis(100));
         wait.until( x -> file.exists());

         WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div[1]/a[1]"));
         clickOn(homeButton);

         String actualUrl = driver.getCurrentUrl();
         String expectedUrl = "https://www.prestashop.com/en";

         Assert.assertEquals(actualUrl,expectedUrl);

         return this;

     }catch (Exception e){

         System.out.println("Error: "+e.getMessage());
         return null;
     }
   }
}
