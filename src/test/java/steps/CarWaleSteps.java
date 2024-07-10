package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.SeleniumDriver;

public class CarWaleSteps{
	
	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("url"));
	}
	@Given("user moveover to new cars")
	public void user_moveover_to_new_cars() {
	    
	}
	@Then("user clicks on FindNewCars")
	public void user_clicks_on_find_new_cars() {
	    
	}
	@Then("user clicks on Toyota cars")
	public void user_clicks_on_toyota_cars() {
	    
	}
	@Then("user validates the carTitle as Toyota Cars")
	public void user_validates_the_car_title_as_toyota_cars() {
	   
	}

}
