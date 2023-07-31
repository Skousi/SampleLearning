package POM_Samples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class addcart {
	WebDriver driver;
	@Test
	public void cartinfo() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		PageFactory.initElements(driver, E_Loginpage.class);
		E_Loginpage.username.sendKeys("standard_user");
		E_Loginpage.password.sendKeys("secret_sauce");
		E_Loginpage.logbot.click();	
		
		PageFactory.initElements(driver, E_addcartdetail.class);
		E_addcartdetail.order.click();
		E_addcartdetail.crt.click();
		E_addcartdetail.chko.click();
		E_addcartdetail.use.sendKeys("Addam");
		E_addcartdetail.luse.sendKeys("family");
		E_addcartdetail.pins.sendKeys("444");
		E_addcartdetail.cons.click();
		E_addcartdetail.done.click();
		File srcs=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\kousa\\OneDrive\\Pictures\\Saved Pictures\\checkout.png");
		FileHandler.copy(srcs, desti);
		driver.quit();
		
	}
}
