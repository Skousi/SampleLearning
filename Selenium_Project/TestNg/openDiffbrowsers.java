package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class openDiffbrowsers {
	WebDriver driver;
	long start;
	long end;
	long total;
	@BeforeSuite
	public void launchbrow() {
		start=System.currentTimeMillis();
		driver=new ChromeDriver();
	}
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com/");
	}

	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com/");
	}
	@Test
	public void openbing() {
		driver.get("https://www.bing.com/");
	}
	@AfterSuite
	public void closebrow() {
		driver.quit();
		end=System.currentTimeMillis();
		total=end-start;
		System.out.println(total);
	}

}
