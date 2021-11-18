package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.Mediator;

public class OnDemand {

    @Given("user scrolls to find a movie with 18A rating")
    public void user_scrolls_to_find_a_movie_with_18a_rating() {
        Mediator.onDemand().scrollToMovies();
    }

    @When("user click on the 18A rating")
    public void user_click_on_the_18a_rating() {
        Mediator.onDemand().clickOnMoviesWith18ARating();
    }

}
