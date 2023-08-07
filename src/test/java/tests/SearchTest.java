package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ResultsPage;
import pages.SearchPage;

public class SearchTest extends AppiumConfig {


    //TODO city datefrom and date to

    @Test
    public void seachtest() throws InterruptedException {


        String str = "CHEVROLET COMARO";

        SearchPage searchPage = new SearchPage(driver);
        Thread.sleep(5000);
        searchPage.CheckingSeachcar();
        Thread.sleep(5000);
        String car1 = new ResultsPage(driver).Car1();
        Assert.assertEquals(car1, str);


    }


}
