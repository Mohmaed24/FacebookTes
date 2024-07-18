package org.stepDefinition;

import org.utilities.LoginPogoClass;
import cucumber.api.java.en.*;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.utilities.CodeReuse;

public class LoginStepDefinition extends CodeReuse {

	
	@Given("User should open the chorme browser and launch the url")
	public void user_should_open_the_chorme_browser_and_launch_the_url() {
	
		launchBrowser();
		url("https://www.facebook.com");
	  
	}
	
	
	@When("User should enter the invalid credentials in the input feilds")
	public void user_should_enter_the_invalid_credentials_in_the_input_feilds() {
		
		LoginPogoClass lp = new LoginPogoClass();
		WebElement txtUsername = lp.getTxtUsername();
		valuePass(txtUsername, "Smart");
		
		WebElement txtPassword = lp.getTxtPassword();
	    valuePass(txtPassword, "12345");
		
	}
	@When("User to click login button")
	public void user_to_click_login_button() throws InterruptedException {
		
		LoginPogoClass lp = new LoginPogoClass();
		WebElement btnLogin = lp.getBtnLogin();
		clickButton(btnLogin);

	}

//	@When("User login check invalid page opendUp")
//	public void user_login_check_invalid_page_opendUp() {
//	    
//		String url = getUrl();
//	    org.junit.Assert.assertTrue(url.contains("privacy"));
//		
//	}

@When("User should get the title of the page")
public void user_should_get_the_title_of_the_page() {
    String title = driver.getTitle();
}

@When("User should enter the valid credentials in the input feilds")
public void user_should_enter_the_valid_credentials_in_the_input_feilds() {
	LoginPogoClass lp = new LoginPogoClass();
	WebElement txtUsername = lp.getTxtUsername();
	valuePass(txtUsername, "Smart123");
	
	WebElement txtPassword = lp.getTxtPassword();
    valuePass(txtPassword, "12345678");
}
//@When("User passes username{string} and password{string}")
//public void user_passes_username_and_password(String s1, String s2) {
//	LoginPogoClass lp = new LoginPogoClass();
//	WebElement txtUsername = lp.getTxtUsername();
//	valuePass(txtUsername, s1);
//	
//	WebElement txtPassword = lp.getTxtPassword();
//    valuePass(txtPassword, s2);
//}

@When("User should enter the invalid credentials in the feilds with List")
public void user_should_enter_the_invalid_credentials_in_the_feilds_with_List(io.cucumber.datatable.DataTable d) {
	List<Map<String, String>> m = d.asMaps();
	String uname1 = m.get(1).get("BYE");
    String Pass1 = m.get(2).get("BYE2");
	
	LoginPogoClass lp = new LoginPogoClass();
	WebElement txtUsername = lp.getTxtUsername();
	valuePass(txtUsername, uname1);
	
	WebElement txtPassword = lp.getTxtPassword();
    valuePass(txtPassword, Pass1);
}
}
