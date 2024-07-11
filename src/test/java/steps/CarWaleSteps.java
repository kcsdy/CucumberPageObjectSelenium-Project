package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.SeleniumDriver;

public class CarWaleSteps {

	@Given("user navigates to carwale website")
	public void user_navigates_to_carwale_website() {
		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("url"));
		SeleniumDriver.getDriver().findElement(By.xpath("//header/div[1]/div[2]/div[3]/div[1]/*[1]")).click();
	}

	@Given("user moveover to new cars")
	public void user_moveover_to_new_cars() {
		SeleniumDriver.getDriver().findElement(By.xpath(SeleniumDriver.OR.getProperty("newCarsBtn"))).click();
	}

	@Then("user clicks on FindNewCars")
	public void user_clicks_on_find_new_cars() {
		SeleniumDriver.getDriver().findElement(By.xpath(SeleniumDriver.OR.getProperty("findNewCarsBtn"))).click();
	}

	@Then("user clicks on Toyota cars")
	public void user_clicks_on_toyota_cars() {
		SeleniumDriver.getDriver().findElement(By.xpath(SeleniumDriver.OR.getProperty("ToyotaCarBtn"))).click();
	}

	@Then("user validates the carTitle as Toyota Cars")
	public void user_validates_the_car_title_as_toyota_cars() {
		String carTitleText = SeleniumDriver.getDriver()
				.findElement(By.xpath(SeleniumDriver.OR.getProperty("ToyotaCarPageTitle"))).getText();
		System.out.println(carTitleText);
		Assert.assertTrue(carTitleText.equals("Toyota Cars"));
	}

}
