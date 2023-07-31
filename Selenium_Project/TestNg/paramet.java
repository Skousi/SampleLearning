package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramet {
	WebDriver driver;
	@Test
	@Parameters({"user","passwo"})
	public void sauce(String name, String passw) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement users=driver.findElement(By.id("user-name"));
		users.sendKeys(name);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(passw);
		WebElement but=driver.findElement(By.id("login-button"));
		but.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
