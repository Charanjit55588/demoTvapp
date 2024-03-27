package pageobjects;

import environment.DriverConfiguration;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screenobjects.Login;

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


    public static void scrollToText(AndroidDriver<MobileElement> driver) {
        MobileElement element1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\"Channels >\"))"));
    }

    public static void pause() throws InterruptedException {
        Thread.sleep(2000);
    }

    /*
    For the ScreenObject class I have created a method which returns an object of the class.
    Methods are kept static. So, they can be called with class name
     */
    public static Login login() {
        return new Login(driver);
    }

}
