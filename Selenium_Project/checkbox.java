import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		checkbox cb1=new checkbox();
		cb1.cb();

	}
	public void cb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		WebElement cb1=driver.findElement(By.id("bmwcheck"));
		WebElement cb2=driver.findElement(By.id("benzcheck"));
		WebElement cb3=driver.findElement(By.id("hondacheck"));
		cb1.click();
		cb2.click();
		cb3.click();
		boolean b=cb3.isSelected();
		System.out.println(b);
		if(cb3.isSelected()) {
			cb3.click();
			System.out.println("deselected");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
