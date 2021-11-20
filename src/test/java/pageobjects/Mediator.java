package pageobjects;

import environment.DriverConfiguration;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import screenobjects.Home;
import screenobjects.MovieDetails;
import screenobjects.OnDemand;
import screenobjects.Onboarding;

import java.net.MalformedURLException;

public class Mediator {

    public static MobileDriver<MobileElement> driver;

    //Called the driver from the Driver Configuration class
    static {
        try {
            DriverConfiguration configuration = DriverConfiguration.getInstance();
            Mediator.driver = configuration.setUpConfiguration();
        } catch (MalformedURLException e) {
            throw new RuntimeException();
        }

    }

    public static void verticallyScrollToText(AndroidDriver<MobileElement> driver, String searchText) {
        MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + searchText + "\"));"));
    }

    public static void horizontallyScrollToText(AndroidDriver<MobileElement> driver, String searchText) {
        MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
                        ".scrollIntoView(new UiSelector().textContains(\"" + searchText + "\"));"));
    }

    public static void findMoviesWithRatings(MobileElement elementForRating, String expectedRatingText){
        String getMovieDetails=elementForRating.getText();
        Assert.assertEquals(getMovieDetails.substring(0, 3), expectedRatingText);
    }

    /*
    For the ScreenObject class I have created a method which returns an object of the class.
    Methods are kept static. So, they can be called with class name
     */
    public static Home home() {
        return new Home(driver);
    }

    public static MovieDetails movieDetails() {
        return new MovieDetails(driver);
    }

    public static Onboarding onboarding() {
        return new Onboarding(driver);
    }

    public static OnDemand onDemand() {
        return new OnDemand(driver);
    }
}
