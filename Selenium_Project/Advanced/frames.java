package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		frames ifram=new frames();
		ifram.fram();

	}
	public void fram() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\Learning\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement fram1=driver.findElement(By.id("Click"));
		fram1.click();
		Thread.sleep(1000);
		String mess=fram1.getText();
		System.out.println(mess);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement fram2=driver.findElement(By.id("Click"));
		fram2.click();
		Thread.sleep(2000);
		String mess1=fram2.getText();
		System.out.println(mess1);
		driver.switchTo().defaultContent();
		List<WebElement> a=driver.findElements(By.tagName("iframe"));
		int b=a.size();
		System.out.println(b);
		driver.quit();
		
	}
	

}
