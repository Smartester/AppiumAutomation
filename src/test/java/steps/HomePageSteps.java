package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import common.driver.DriverConfigurator;

import java.net.MalformedURLException;

/**
 *
 * Created by tejasvi on 24/07/2016.
 */
public class HomePageSteps extends DriverConfigurator{
    public HomePageSteps() throws MalformedURLException {}

    @Given("^I choose to select and option$")
    public void iChooseToSelectAndOption() throws Throwable {
        new HomePage(driver).waitForHomeScreen();
    }

    @Then("^I see response on screen$")
    public void iSeeResponseOnScreen() throws Throwable {
        new HomePage(driver).VerifyActiononHomeScree();
    }


    @After
    public void tearDown(){
        killAppiumSession();
    }
}

