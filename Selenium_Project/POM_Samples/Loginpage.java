package POM_Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpage {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		PageFactory.initElements(driver, E_Loginpage.class);
		
		E_Loginpage.username.sendKeys("standard_user");
		E_Loginpage.password.sendKeys("secret_sauce");
		E_Loginpage.logbot.click();	
		driver.quit(); 
	}
	

}
