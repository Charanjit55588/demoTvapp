package environment;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverConfiguration {

    //Singleton class is implemented to have only one instance of the class at a time
    private static DriverConfiguration instance;

    private DriverConfiguration() {

    }

    synchronized public static DriverConfiguration getInstance() {
        if (instance == null) {
            instance = new DriverConfiguration();
        }
        return instance;
    }

    public MobileDriver<MobileElement> setUpConfiguration() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.example.automationapp");
        capabilities.setCapability("appActivity", "com.example.automationapp.ui.login.LoginActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "emulator-5556");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("newCommandTimeout", "240");

        MobileDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }


}






