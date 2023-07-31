package seleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class OpenGoogle {
	
	public static void main(String[] args) {
	WebDriver driver;
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter reporter = new ExtentSparkReporter("test.html");
	extent.attachReporter(reporter);
	ExtentTest test = extent.createTest("open google");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String a = driver.getTitle();
	if (a.equals("Google")) {
		test.pass("Google passed");
	} else {
		test.fail("Google failed");
	}
	driver.get("https://www.bing.com/");
	ExtentTest test2 = extent.createTest("open bing");
	String b = driver.getTitle();
	if (b.equals("Bing")) {
		test2.pass("bing passed");
		test2.info("takes too much time");
	} else {
		test2.fail("bing failed");
		test2.warning("not working");
	}
	driver.quit();
	extent.flush();
}
}
