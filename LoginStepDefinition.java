package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefinition {


	
	@Given("^user is already on login page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver","\\\\Mac\\Home\\Documents\\Work\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.spirit.com/");
		
		
	}
	
	

}
