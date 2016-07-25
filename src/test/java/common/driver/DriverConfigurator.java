package common.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by tejasvi on 25/07/2016.
 */
public class DriverConfigurator {
    protected static AppiumDriver<? extends MobileElement> driver;

    //change deviceConfig to be iOS/Android + simulator/emulator
    public AndroidDeviceConfiguration deviceConfig = new AndroidDeviceConfiguration();
    //    public static final IosDevice deviceConfig = new IosDevice();

    // appium server url
    public static final String serverURL=  "http://127.0.0.1:4723/wd/hub";

    public DriverConfigurator() throws MalformedURLException {
        initializeDriverSession();
    }


    protected void initializeDriverSession() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //mandatory capabilities
        capabilities.setCapability("deviceName", deviceConfig.deviceName);
        capabilities.setCapability("platformName", deviceConfig.platformName);
        capabilities.setCapability("platformVersion", deviceConfig.platformVersion);
        capabilities.setCapability("app",deviceConfig.appPath);
        capabilities.setCapability("device", deviceConfig.device);

        //other caps
        configureSessionForAndroid(capabilities);
    }


    // Initialize  driver
    private void configureSessionForAndroid(DesiredCapabilities capabilities) throws MalformedURLException {
        driver =  new AndroidDriver<MobileElement>(new URL(serverURL), capabilities);
    }

}
