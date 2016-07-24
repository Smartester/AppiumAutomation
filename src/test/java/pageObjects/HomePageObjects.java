package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 *
 * Created by tejasvi on 24/07/2016.
 */
public class HomePageObjects {

    @AndroidFindBy(id = "element_id")
    @iOSFindBy(xpath = "//element_xpath") public MobileElement homePageElement;
}
