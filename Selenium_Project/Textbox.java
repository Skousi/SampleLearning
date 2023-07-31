import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions();
	}
	public static void conditions() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/input-form-demo.html");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.name("first_name"));
		name.sendKeys("addam");
		WebElement fullname=driver.findElement(By.name("last_name"));
		fullname.sendKeys("addam smith"); //append is the same technique
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("abcadam@gmail.com");
		email.clear();
		String title=driver.getTitle();
		System.out.println(title);
		WebElement mobile=driver.findElement(By.name("phone"));
		mobile.sendKeys("9854321230");
		WebElement radio=driver.findElement(By.name("hosting"));
		String nnum=radio.getAttribute("value");
		System.out.println(nnum);
		WebElement send = driver.findElement(By.xpath("//*[@id=\'contact_form\']/fieldset/div[13]/div/button"));
		send.click();
		Boolean enabled=send.isEnabled();
		System.out.println(enabled);
		driver.quit();
		
		
		
		
	}
}
