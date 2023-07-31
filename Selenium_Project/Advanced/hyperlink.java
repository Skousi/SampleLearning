package Advanced;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		hyperlink hype=new hyperlink();
		hype.hyper();

	}
	public void hyper() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\Learning\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		WebElement first=driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/a"));
		first.click();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement second =driver.findElement(By.linkText("Find the URL without clicking me."));
		String linkinfo=second.getAttribute("href");
		System.out.println("link goes to  " +linkinfo);
		WebElement thrid=driver.findElement(By.partialLinkText("Broken"));
		thrid.click();
		String error=driver.getTitle();
		if (error.contains("404")) {
			System.out.println("this link is broken");
			
		}else {
			System.out.println("this link works");
		}
		driver.navigate().back();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int a=links.size();
		System.out.println(a);
		driver.close();
	}

}
