package Pages;

import Automation.AutomatonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SearchFindAdd extends AutomatonMethods {

    public SearchFindAdd(WebDriver driver) {
        super(driver);
    }


    public SearchFindAdd searchFindAdd(){

        try {
            driver.get(getUrl());

            WebElement womenMenu = waitVisibility(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")));
            hover(womenMenu);

            WebElement tShirts = waitVisibility(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")));
            clickOn(tShirts);

            WebElement mSize = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-layered_id_attribute_group_2\"]")));
            mSize.click();

            WebElement cotton = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-layered_id_feature_5\"]")));
            clickOn(cotton);

            WebElement slider = waitVisibility(driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]")));
            slider(slider);

            new Select(driver.findElement(By.xpath("//*[@id=\"selectProductSort\"]"))).selectByValue("name:asc");

            WebElement tShirtHover = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")));
            hover(tShirtHover);

            WebElement tShirtsAddToCart = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")));
            clickOn(tShirtsAddToCart);

            WebElement continueShopping = waitVisibility(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")));
            clickOn(continueShopping);

            WebElement tops = waitVisibility(driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/a[3]")));
            clickOn(tops);

            WebElement blouse = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-layered_category_7\"]")));
            clickOn(blouse);

            WebElement lSize = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-layered_id_attribute_group_3\"]")));
            clickOn(lSize);

            WebElement blouseHover = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")));
            hover(blouseHover);

            WebElement more = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]")));
            clickOn(more);

            WebElement viewLarger = waitVisibility(driver.findElement(By.xpath("//*[@id=\"bigpic\"]")));
            clickOn(viewLarger);

            WebElement closePic = waitVisibility(driver.findElement(By.xpath("//*[@id=\"product\"]/div[3]")));
            clickOn(closePic);

            new Select(driver.findElement(By.xpath("//*[@id=\"group_1\"]"))).selectByValue("2");

            WebElement chooseBlack = waitVisibility(driver.findElement(By.xpath("//*[@id=\"color_11\"]")));
            clickOn(chooseBlack);

            WebElement blouseAddToCart = waitVisibility(driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")));
            clickOn(blouseAddToCart);

            WebElement proceedToCheckout1 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")));
            clickOn(proceedToCheckout1);

            WebElement deleteDress = waitVisibility(driver.findElement(By.xpath("//*[@id=\"1_1_0_0\"]")));
            clickOn(deleteDress);

            WebElement proceedToCheckout2 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")));
            clickOn(proceedToCheckout2);

            WebElement email = waitVisibility(driver.findElement(By.xpath("//*[@id=\"email\"]")));
            writeText(email,getEmail());

            WebElement password = waitVisibility(driver.findElement(By.xpath("//*[@id=\"passwd\"]")));
            writeText(password,getPassword());

            WebElement login = waitVisibility(driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")));
            clickOn(login);

            WebElement addComment = waitVisibility(driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")));
            writeText(addComment,"GREAT SHOPPING!!");

            WebElement proceedToCheckout3 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")));
            clickOn(proceedToCheckout3);

            WebElement termsOfUse = waitVisibility(driver.findElement(By.xpath("//*[@id=\"uniform-cgv\"]")));
            termsOfUse.click();

            WebElement proceedToCheckout4 = waitVisibility(driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")));
            clickOn(proceedToCheckout4);

            WebElement payByCheck = waitVisibility(driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")));
            clickOn(payByCheck);

            WebElement confirmOrder = waitVisibility(driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")));
            clickOn(confirmOrder);

            WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));

            Assert.assertEquals(confirmation.getText(),"ORDER CONFIRMATION");

            return this;

        }catch (Exception e){

            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }
}
