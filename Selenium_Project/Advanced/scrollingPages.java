package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scrollingPages {
	WebDriver driver;
	
	@Test
	public void scrolling() throws AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		JavascriptExecutor exec= (JavascriptExecutor)driver;
		//scroll to some position
		/*
		 * exec.executeScript("window.scroll(0,240)", "");
		 * exec.executeScript("window.scroll(0,-240)", "");
		 */
		
		//scroll to the end and top
		/*
		 * exec.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		 * exec.executeScript("window.scroll(0,0)", "");
		 */
		
		//scroll to see element view
		/*
		 * WebElement
		 * message=driver.findElement(By.xpath("//div[@id='j_idt146_content']/div"));
		 * exec.executeScript("arguments[0].scrollIntoView(true);", message);
		 */
		//using robot class
		Robot robo= new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		robo.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
	}

}
