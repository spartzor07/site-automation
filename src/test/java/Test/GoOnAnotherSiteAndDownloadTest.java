package Test;

import Automation.AutomationTool;
import Pages.GoOnAnotherSiteAndDownload;
import org.testng.annotations.Test;

public class GoOnAnotherSiteAndDownloadTest extends AutomationTool {

    @Test
    public void getGoOnAnotherSite() {

        GoOnAnotherSiteAndDownload goOnAnotherSite = new GoOnAnotherSiteAndDownload(driver);
        goOnAnotherSite.goOnAnotherSite();
    }
}
