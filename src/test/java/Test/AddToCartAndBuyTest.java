package Test;

import Automation.AutomationTool;
import Pages.AddToCartAndBuy;
import org.testng.annotations.Test;

public class AddToCartAndBuyTest extends AutomationTool {

    @Test
    public void search() {

        AddToCartAndBuy searchAddBuy = new AddToCartAndBuy(driver);
        searchAddBuy.buying();
    }
}
