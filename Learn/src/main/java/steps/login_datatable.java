package steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login_datatable {
	WebDriver driver;
	@Given("Launch chrome browser open sauce lab URL")
	public void launch_chrome_browser_open_sauce_lab_url() {
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		  driver.get("https://www.saucedemo.com/"); 
		  PageFactory.initElements(driver,
		  E_loginpage.class);
	}
	@When("Enters the username and password")
	public void enters_the_username_and_password(DataTable dataTable) {
		//datatablewithout headers
//		List<List<String>> creds = dataTable.asLists(String.class); 
//		String username = creds.get(0).get(0); 
//		String password = creds.get(0).get(1);
		List<Map<String, String>> creds=dataTable.asMaps(String.class, String.class);
		String usern=creds.get(0).get("username");
		String passw=creds.get(0).get("password");
		E_loginpage.usern.sendKeys(usern); 
		E_loginpage.passw.sendKeys(passw); 
		
	}
	@When("click login button")
	public void click_login_button() {
		  E_loginpage.btn.submit(); 
	}
	@Then("user able to login to the app")
	public void user_able_to_login_to_the_app() {
		System.out.println(driver.getTitle());
		  driver.quit(); 
	}
	    
	}
	  