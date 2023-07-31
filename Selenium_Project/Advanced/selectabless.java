package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectabless {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		selectabless sel=new selectabless();
		sel.select();

	}
	public void select() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/list.xhtml"); 
		List<WebElement> selectable=driver.findElements(By.xpath("//*[@id='pickList']/div[2]/ul/li"));
		int a =selectable.size();
		System.out.println(a);
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).build().perform();
		
		Actions news=new Actions(driver);
		news.clickAndHold(selectable.get(3));
		news.clickAndHold(selectable.get(4));
		news.build().perform();
	}

}
