package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	WebDriver driver;
	@Test
	public void openbrowsr(){
		WebDriverManager.chromedriver().setup();
		ChromeOptions opton=new ChromeOptions();
		opton.addArguments("--start-maximized");
		driver=new ChromeDriver(opton);
		String url="https://demoqa.com/text-box";
		JavascriptExecutor execute=(JavascriptExecutor)driver;
		execute.executeScript("window.location='"+url+"';");
		String userName="userName";
		String sat="SAT";
		execute.executeScript("document.getElementById('"+userName+"').value='"+sat+"';"); //FIND ELEMENT & ENTER value without sendkeys
		WebElement text1=driver.findElement(By.id("userEmail"));
		execute.executeScript("arguments[0].value='user@email.com'", text1);//Enter value without sendkeys
		execute.executeScript("window.scrollBy(0,500);");//scrolldown/up
		execute.executeScript("arguments[0].scrollIntoView(true);",text1);//scroll to element
		
		
	}
	

}
