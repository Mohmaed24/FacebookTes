package org.stepDefinition;

import org.utilities.CodeReuse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.*;

public class ForgotPassword extends CodeReuse{
	
	@Given("User should open the chorme browser and goto facebook")
	public void user_should_open_the_chorme_browser_and_goto_facebook() {
	 
		launchBrowser();
		url("https://www.facebook.com");
	}
	
	@When("User should click the forgotpassword button")
	public void user_shoul_click_the_forgotpassword_button() {
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

	@When("Navigate to the password reset page")
	public void navigate_to_the_password_reset_page() {
	 driver.getTitle().contains("Forgotten Pasword");
	 System.out.println("Correct Web Page");
	}
	

	@When("User should pass the moble number")
	public void user_should_pass_the_moble_number() {
	driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("00012000120");
	}

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	}

	@Then("Validate the page url to know if password has resetted")
	public void validate_the_page_url_to_know_if_password_has_resetted() {
	 driver.getCurrentUrl().contains("recover/account/");
	 System.out.println("Passed");
	}

}
