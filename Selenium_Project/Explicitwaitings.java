import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Explicitwaitings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement alert1=wait.until(ExpectedConditions.elementToBeClickable((By.id("alertbtn"))));
		alert1.click();
		Alert a1= driver.switchTo().alert();
		a1.accept();
		driver.quit();
		
		
	}

}
