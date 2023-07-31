package Advanced;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Autocompletion au=new Autocompletion();
		au.autocom();

	}
	public void autocom() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement auto=driver.findElement(By.id("j_idt87:auto-complete_input"));
		auto.sendKeys("P");
		Thread.sleep(4000);
		List<WebElement> options=driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']/ul/li"));
		int a =options.size();
		System.out.println(a);
		for (WebElement webElement : options) {
			if (webElement.getText().equals("PostMan")) {
				webElement.click();
				System.out.println(webElement.getText());
				break;
			}
			
		}
		driver.quit();
	}

}
