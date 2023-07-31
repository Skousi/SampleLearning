package Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		windowhandle handle=new windowhandle();
		handle.newwin();
		

	}
	public void newwin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		String oldwindow=driver.getWindowHandle();
		WebElement neww1=driver.findElement(By.id("j_idt88:new"));
		neww1.click();
		Set<String>neww=driver.getWindowHandles();
		for (String string : neww) {
			driver.switchTo().window(string);	
		}
		WebElement setting=driver.findElement(By.id("layout-config-button")); 
		setting.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(oldwindow);
		WebElement multi =driver.findElement(By.id("j_idt88:j_idt91"));
		multi.click();
		int count=driver.getWindowHandles().size();
		System.out.println(count);
		WebElement clos=driver.findElement(By.id("j_idt88:j_idt93"));
		clos.click();
		Set<String>clost=driver.getWindowHandles();
		for (String newwi : clost) {
			if (!newwi.equals(oldwindow)) {
				driver.switchTo().window(newwi);
				driver.close();
			}
			
		}
		Thread.sleep(2000);
		driver.switchTo().window(oldwindow);
		WebElement setting1=driver.findElement(By.id("layout-config-button"));
		setting1.click();
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
		driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://www.leafground.com/alert.xhtml");
		driver.quit();
	}

}
