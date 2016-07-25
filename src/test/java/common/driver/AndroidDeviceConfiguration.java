package common.driver;

/**
 * Created by tejasvi on 25/07/2016.
 */
public class AndroidDeviceConfiguration {
    public static final String platformName = "Android";
    public static final String deviceName = "Android";
    public static final String device = "Android";
    public static final String platformVersion = "6.0";

    public static final String appName = "android-app.apk";
    public static final String appPath = System.getProperty("user.dir")+"/apps/"+appName;
    public static final String appPackage = "com.test.package";
    public static final String appActivity = "com.test.package./launchactivity";
}
