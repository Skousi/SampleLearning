package POM_Samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class phplog2 {
	WebDriver driver;
	public static WebElement email;
	public static WebElement password;
	public static WebElement submitBTN;

	@Test
	public void logi() {
		driver=new ChromeDriver();
		driver.get("https://phptravels.net/login");
		PageFactory.initElements(driver, phplog2.class);
		email.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		submitBTN.click();
		System.out.println("done");
		driver.quit();
		
	}
}
