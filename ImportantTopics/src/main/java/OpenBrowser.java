import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	static WebDriver driver;
	@Test
	public static void before() throws IOException {
	FileInputStream fileread= new FileInputStream("config.properties");
	Properties property=new Properties();
	property.load(fileread);
	String browser=property.getProperty("browser");
	String url1=property.getProperty("googleURL");	
	String url2=property.getProperty("yahooURL");	
	String url3=property.getProperty("bingURL");
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url1);
		driver.quit();
	}else if (browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(url2);
		driver.quit();
	}else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url3);
		driver.quit();
	}
	
	}
		
	}

