package stepdefinition;

import io.cucumber.java.en.Given;
import pageobjects.Mediator;

public class Home {

    @Given("user click on the OnDemand option")
    public void user_click_on_the_on_demand_option() {
        Mediator.home().waitForScreenToLoad();
        Mediator.home().clickOnDemand();
    }

}
