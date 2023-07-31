package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resize res=new resize();
		res.resiz();

	}
	public void resiz() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Learning\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		WebElement image=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		Actions action = new Actions(driver);
		action.clickAndHold(image).moveByOffset(560, 60);
		driver.quit();
	}

}
