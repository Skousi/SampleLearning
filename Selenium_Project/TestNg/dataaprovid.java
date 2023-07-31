package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataaprovid {

	WebDriver driver;
	String[][] datas= {
		{"standard_user","secret_sauce"},
		{"standard_user1","secret_sauce"},
		{"standard_user","secret_sauce2"},
		{"standard_user1","secret_sauce2"},
	};
	@DataProvider(name = "dataprov")
	public String[][] loggindata(){
		return datas;
	}
		
	@Test(dataProvider = "dataprov" )
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
