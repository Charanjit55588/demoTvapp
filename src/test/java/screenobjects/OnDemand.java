package screenobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobjects.ElementInitializer;
import pageobjects.Mediator;

public class OnDemand extends ElementInitializer {

    public OnDemand(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "*//android.widget.TextView[@text='18A' and @index='4']")
    public MobileElement rating18A;

    public void scrollToMovies() {
        Mediator.scrollToText((AndroidDriver<MobileElement>) driver);
    }

    public void clickOnMoviesWith18ARating() {
        rating18A.click();
    }


}
