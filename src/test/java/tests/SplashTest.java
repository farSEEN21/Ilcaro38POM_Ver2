package tests;

import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SplashScreen;

public class SplashTest extends AppiumConfig {






@Test
    public void title2Test() {
        String str="The Ultimate Car Rental Service".toUpperCase();
        SplashScreen splashPage = new SplashScreen(driver);
        Assert.assertEquals(splashPage.getTextTitle2(), str);


    }


}
