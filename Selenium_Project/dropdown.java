import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		dropdown me = new dropdown();
		me.drop();
	}
	public void drop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		WebElement drop1=driver.findElement(By.id("carselect"));
		drop1.sendKeys("Honda");
		Select s1= new Select(drop1);
		s1.selectByIndex(1);
		String br=s1.getFirstSelectedOption().getText();
		System.out.println(br);
		Thread.sleep(1000);
		s1.selectByValue("honda");
		Thread.sleep(1000);
		s1.selectByVisibleText("BMW");
		Thread.sleep(1000);
		List<WebElement> store=s1.getOptions();
		int count=store.size();
		System.out.println(count);
		//multiselect
		WebElement multi=driver.findElement(By.id("multiple-select-example"));
		Select multis=new Select(multi);
		multis.selectByIndex(1);
		multis.selectByIndex(2);
		driver.quit();
	}

}
