package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {
    public ResultsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/resultTitle']")
    MobileElement tittle;
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/resultRv']")
    MobileElement result;
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/rowContainer']")
    MobileElement cars;

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/emptyTxt']")
    MobileElement NoCars;
    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/titleTxt']")
    MobileElement Car1;


    public String Title() {
        return tittle.getText();
    }

    public String NoCars() {
        return NoCars.getText();
    }

    public String Car1() {
        return Car1.getText();
    }


}
