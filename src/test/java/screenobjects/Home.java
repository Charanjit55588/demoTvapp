package screenobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobjects.ElementInitializer;

public class Home extends ElementInitializer {

    public Home(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Home")
    public MobileElement homeScreenTab;

    @AndroidFindBy(accessibility = "On Demand")
    public MobileElement onDemandLink;

    public void waitForScreenToLoad() {
        homeScreenTab.isDisplayed();
    }

    public void clickOnDemand() {
        onDemandLink.click();
    }
}
