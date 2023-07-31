import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class samples {
	static WebElement q;
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		ChromeOptions max=new ChromeOptions().addArguments("--start-maximized");
		ChromeDriver driver=new ChromeDriver(max);
		driver.get("https://www.google.com/");

		//WebElement searchbox=driver.findElement(By.xpath("//*[@title='Search']"));
		//searchbox.sendKeys("paint"+Keys.ENTER);
		//searchbox.sendKeys("paint \n");
		//searchbox.submit();
		//Robot robo=new Robot();
		//robo.keyPress(KeyEvent.VK_ENTER);
		//robo.keyRelease(KeyEvent.VK_ENTER);
		
		//driver.switchTo().activeElement().sendKeys("paint \n");
		PageFactory.initElements(driver, samples.class);
		q.sendKeys("paint \n");
	}

}