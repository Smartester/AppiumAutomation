package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class BasePage {


    protected AppiumDriver<? extends MobileElement> driver;

    public BasePage(AppiumDriver<? extends MobileElement> driver) {
        this.driver = driver;
    }

    public void waitForAppLaunch(MobileElement id) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(id));
        wait.until(ExpectedConditions.elementToBeClickable(id));
    }
}
