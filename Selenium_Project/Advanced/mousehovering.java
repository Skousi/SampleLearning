package Advanced;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mousehovering {
	
WebDriver driver;
	
	@Test
	public void scrolling() throws AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement links=driver.findElement(By.xpath("//*[text()='Take me to dashboard']/following::a[1]"));
		String a=links.getCssValue("text-decoration");
		System.out.println(a);
		Actions action = new Actions(driver);
		action.moveToElement(links).build().perform();
		String b=links.getCssValue("text-decoration");
		System.out.println(b);

}

}