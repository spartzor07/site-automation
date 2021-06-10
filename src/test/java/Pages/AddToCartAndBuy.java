package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddToCartAndBuy extends AutomatonMethods {

    public AddToCartAndBuy(WebDriver driver) {
        super(driver);
    }


    public AddToCartAndBuy buying(){

        try {
            driver.get(getUrl());

            WebElement clickAddCart1Hover1 = waitVisibility(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[1]/div/a[1]/img")));
            hover(clickAddCart1Hover1);

            WebElement clickAddCart1 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[2]/a[1]")));
            clickOn(clickAddCart1);

            WebElement continueShopping = waitVisibility(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));
            clickOn(continueShopping);

            WebElement clickAddCart1Hover2 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")));
            hover(clickAddCart1Hover2);

            WebElement clickAddCart2 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]")));
            clickOn(clickAddCart2);

            WebElement proceedToCheckOut1 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")));
            clickOn(proceedToCheckOut1);

            WebElement proceedToCheckOut2 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")));
            clickOn(proceedToCheckOut2);

            WebElement email = waitVisibility(driver.findElement(By.xpath("//*[@id=\"email\"]")));
            writeText(email,getEmail());

            WebElement password = waitVisibility(driver.findElement(By.xpath("//*[@id=\"passwd\"]")));
            writeText(password,getPassword());

            WebElement login = waitVisibility(driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")));
            clickOn(login);

            WebElement addComment = waitVisibility(driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")));
            writeText(addComment,"some comment");

            WebElement proceedToCheckOut3 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")));
            clickOn(proceedToCheckOut3);

            WebElement termOfUse = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]")));
            clickOn(termOfUse);

            WebElement proceedToCheckOut4 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")));
            clickOn(proceedToCheckOut4);

            WebElement payByBankWire = waitVisibility(driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")));
            clickOn(payByBankWire);

            WebElement payConfirm = waitVisibility(driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")));
            clickOn(payConfirm);

            WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));

            Assert.assertEquals(confirmation.getText(),"ORDER CONFIRMATION");

            return this;

        }catch (Exception e){

            System.out.println("Error: "+e.getMessage());
            return null;
        }

    }

}
