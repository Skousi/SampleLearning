import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class portallinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		portal();

	}
	public static void portal() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.linkText("HOME")).click();
		driver.navigate().back();
		driver.navigate().forward();
	}

}
