package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdef {
	WebDriver driver;
	@Given("Launch the chrome browser open sauce lab URL")
	public void launch_the_chrome_browser_open_sauce_lab_url() {
	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  PageFactory.initElements(driver, E_loginpage.class);
	}
	@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
	   E_loginpage.usern.sendKeys(username);
	   E_loginpage.passw.sendKeys(password);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
	    E_loginpage.btn.submit();
	}
	@Then("user should be able to login to the app")
	public void user_should_be_able_to_login_to_the_app() {
	    System.out.println(driver.getTitle());
	    driver.quit();
	}



}
