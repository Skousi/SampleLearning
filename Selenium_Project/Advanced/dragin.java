package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dragin dragg=new dragin();
		dragg.dragi();

	}
	public void dragi() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Learning\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement drag=driver.findElement(By.id("form:drag_content"));
		WebElement drop=driver.findElement(By.id("form:drop_content"));
		Actions newac=new Actions(driver);
		newac.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		String a=drop.getText();
		System.out.println(a);
		//tooltip 
		WebElement tools=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/ul/li[2]/a"));
		String tool=tools.getAttribute("data-tooltip");
		System.out.println(tool);
		
		driver.quit();
		
	}

}
