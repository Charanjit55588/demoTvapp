package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.Mediator;

public class Login {

    @Given("user opens the app")
    public void user_opens_the_app() throws InterruptedException {
        Mediator.login().waitForScreenToLoad();
        Mediator.pause();
    }

    @Given("user enters {string} address")
    public void user_enters_email_address(String email) {
        Mediator.login().setEmail(email);
    }

    @Given("user enters {string}")
    public void user_enters_password(String password) {
        Mediator.login().setPassword(password);
    }

    @When("user clicks on the sign in")
    public void user_clicks_on_the_sign_in() {
        Mediator.login().login();
    }

    @When("user is taken to home screen")
    public void user_is_taken_to_home_screen() {

    }


}
