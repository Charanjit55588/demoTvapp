package pageobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class ElementInitializer {
    public MobileDriver<MobileElement> driver;

    //Default decorator with Page Factory will decorate @AndroidFindBy or Even @iOSFindBy

    public ElementInitializer(MobileDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(60)), this);
    }
}
