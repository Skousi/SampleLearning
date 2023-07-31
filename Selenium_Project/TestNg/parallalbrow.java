package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class parallalbrow {

	@Test
	public void opengoogle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
	@Test
	public void openbing() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.quit();
	}
	@Test
	public void Hardassertion() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String a =driver.getTitle();
		Assert.assertEquals(a, "Swag Labs");
		driver.quit();
}
	@Test
	public void softassertion() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		SoftAssert soft=new SoftAssert();
		String a =driver.getTitle();
		soft.assertEquals(a, "Swag Labs");
		soft.assertAll(a);
		driver.quit();
}
}