package screenobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobjects.ElementInitializer;

public class Onboarding extends ElementInitializer {

    public Onboarding(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.optiktv:id/enter_guest_mode")
    public MobileElement viewGuestMode;

    public void clickViewInGuestMode() {
        viewGuestMode.click();
    }

}
