import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobtn btn=new Radiobtn();
		btn.radio();
	}
	public void radio() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		WebElement r1=driver.findElement(By.id("bmwradio"));
		WebElement r2=driver.findElement(By.id("benzradio"));
		WebElement r3=driver.findElement(By.id("hondaradio"));
		r2.click();
		boolean s1=r1.isSelected();
		boolean s2=r2.isSelected();
		boolean s3=r3.isSelected();
		System.out.println(s1+" "+s2+" "+s3);
		
	}

}
