package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import pageObjects.HomePageObjects;

/**
 *
 * Created by tejasvi on 24/07/2016.
 */
public class HomePage extends BasePage{


    HomePageObjects homePageObjects = new HomePageObjects();

    public HomePage(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageObjects);
    }

    public void waitForHomeScreen() {
        waitForAppLaunch(homePageObjects.homePageElement);
        homePageObjects.homePageElement.click();
    }

    public void VerifyActiononHomeScree() {
        waitForAppLaunch(homePageObjects.homePageElement);
        homePageObjects.homePageElement.click();
    }
}
