package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class sorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions ops=new ChromeOptions().addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(ops);
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		WebElement drag=driver.findElement(By.xpath("//*[@id='form:j_idt111_data']//tr[3]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id='form:j_idt111_data']//tr[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop).build().perform();
		
		//columns
		Thread.sleep(3000);
		List<WebElement> drag1=driver.findElements(By.xpath("//*[@id='form:j_idt94_head']//th"));
		WebElement s=drag1.get(1);
		WebElement s1=drag1.get(0);
		Actions acting=new Actions(driver);
		acting.dragAndDrop(s, s1).build().perform();
		driver.quit();
	
		

	}

}
