package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/editLocation']")
    MobileElement location;

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/editFrom']")
    MobileElement dateFrom;


    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/editTo']")
    MobileElement dateTo;

    @FindBy(xpath = "//*[@resource-id='android:id/next']")
    MobileElement nextMonth;

    @FindBy(xpath = "//*[@resource-id='android:id/month_view']/*[@class='android.view.View'][3]")
    MobileElement startDate;

    @FindBy(xpath = "//*[@resource-id='android:id/month_view']/*[@class='android.view.View'][10]")
    MobileElement stopDate;

    @FindBy(xpath = "//*[@resource-id='android:id/button1']")
    MobileElement okBTNCalendar;

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/searchBtn']")
    MobileElement yallaBTN;

    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/findTitle']")
    MobileElement listlocat;

    // get the city name
//    @FindBy(xpath = "//*[@resource-id='com.telran.ilcarro:id/textView']")
//    MobileElement cityNameDropDown;

    public void ChooseLocation() {
        location.sendKeys("Tel Aviv");
        //listlocat.click();
    }

    public void ChooseFirstDate() {
        dateFrom.click();
        nextMonth.click();
        startDate.click();
        okBTNCalendar.click();
    }

    public void ChooseSecondDate() {
        dateTo.click();
        nextMonth.click();
        stopDate.click();
        okBTNCalendar.click();


    }

    public void pressbtn() {
        yallaBTN.click();
    }


    public void CheckingSeachcar() {
        ChooseLocation();
        ChooseFirstDate();
        ChooseSecondDate();
        pressbtn();


    }

}
