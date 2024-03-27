package screenobjects;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobjects.ElementInitializer;

public class Login extends ElementInitializer {

    public Login(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"AutomationApp\"]")
    private MobileElement automationAppLabel;

    @AndroidFindBy(id = "com.example.automationapp:id/username")
    private MobileElement emailTextField;

    @AndroidFindBy(id = "com.example.automationapp:id/password")
    private MobileElement passwordTextField;

    @AndroidFindBy(id = "com.example.automationapp:id/login")
    private MobileElement signInOrRegisterButton;

    public void waitForScreenToLoad() {
        //automationAppLabel.isDisplayed();
    }

    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setPassword(String password){
        passwordTextField.sendKeys(password);
    }

    public void login(){
        signInOrRegisterButton.click();
    }
}
