package Test;

import Automation.AutomationTool;
import Pages.SearchFindAdd;
import org.testng.annotations.Test;

public class SearchFindAddTest extends AutomationTool {

    @Test
    public void searchFindAddTest(){

        SearchFindAdd searchFindAdd = new SearchFindAdd(driver);
        searchFindAdd.searchFindAdd();
    }
}
