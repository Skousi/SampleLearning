package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef {
	WebDriver driver;
	@Given("open google and launch the url")
	public void open_google_and_launch_the_url() {
	WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://www.google.co.in");
	}
	@When("user type value in the search {string} and hit enter")
	public void user_type_value_in_the_search_and_hit_enter(String string) {
		driver.findElement(By.name("q")).sendKeys(string);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("user should get proper result on screen")
	public void user_should_get_proper_result_on_screen() {
		boolean status=driver.findElement(By.partialLinkText("java")).isDisplayed();
		if (status==true) {
			System.out.println("Result displayed");
			
		}else {
			System.out.println("incorrect output");
		}
	    
	}

}
 