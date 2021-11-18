package stepdefinition;

import io.cucumber.java.en.Then;
import pageobjects.Mediator;

public class MovieDetails {
    @Then("user confirms the 18A is displayed on the movie details page")
    public void user_confirms_the_18a_is_displayed_on_the_movie_details_page() {
        Mediator.movieDetails().assertOn18ARating();
    }
}
