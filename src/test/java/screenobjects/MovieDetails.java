package screenobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import pageobjects.ElementInitializer;

public class MovieDetails extends ElementInitializer {

    public MovieDetails(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.optiktv:id/subText1")
    public MobileElement rating18Text;

    public void assertOn18ARating() {
        String movieDetailsText = rating18Text.getText();
        Assert.assertEquals(movieDetailsText.substring(0, 3), "18A");
    }
}
