package stepdefinition;

import io.cucumber.java.en.Given;
import pageobjects.Mediator;

public class Onboarding {
    @Given("user opens he app and enter as guest mode")
    public void user_opens_he_app_and_enter_as_guest_mode() {
        Mediator.onboarding().clickViewInGuestMode();
    }
}
