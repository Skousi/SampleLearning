package Advanced;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calender {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://fengyuanchen.github.io/datepicker/");
		WebElement text=new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.name("date")));
		text.click();
		WebElement cal_next=driver.findElement(By.xpath("//*[@data-view='month next']"));
		for(int i=0; i<3;i++) {
			cal_next.click();	
		}
		WebElement date=new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-view]//li[38]")));
		date.click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File out=new File("C:\\Users\\kousa\\OneDrive\\Pictures\\Saved Pictures\\src.png");
		FileHandler.copy(src, out);
		driver.quit();
				
	}

}
