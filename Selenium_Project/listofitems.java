import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listofitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox=driver.findElement(By.xpath("//*[@title='Search']"));
		searchbox.sendKeys("paint");
		Thread.sleep(3000);
		List<WebElement> slist= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		//int a=0;
		for (WebElement webElement : slist) {
			String text=webElement.getText();
			System.out.println(text);
			//a++;
			if (text.contains("ideas")) {
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		List<WebElement> count=driver.findElements(By.tagName("a"));
		System.out.println(count.size());
		for (WebElement list : count) {
			System.out.println(list.getAttribute("href"));
						
		}
		driver.quit();
	}

}
