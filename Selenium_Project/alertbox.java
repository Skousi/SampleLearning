import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alertbox aler=new alertbox();
		aler.alerts();
	}
	public void alerts() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebElement alert1=driver.findElement(By.id("alertbtn"));
		alert1.click();
		Alert a1= driver.switchTo().alert();
		a1.accept();
		WebElement alert2=driver.findElement(By.id("confirmbtn"));
		alert2.click();
		Alert a2=driver.switchTo().alert();
		a2.dismiss();
		//a2.sendKeys(kd)
		WebElement a=driver.findElement(By.xpath("//*[@id=\'alert-example-div\']/fieldset/legend"));
		String b=a.getText();
		System.out.println(b);
		driver.quit();
	}

}
