import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button();
	}
	public static void button() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.letskodeit.com/practice");
		WebElement bt=driver.findElement(By.id("disabled-button"));
		bt.click();
		Point xyp=bt.getLocation();
		int x=xyp.getX();
		int y=xyp.getY();
		System.out.println(x+""+y);
		String color=bt.getCssValue("background-color");
		System.out.println(color);
		int h=bt.getSize().getHeight();
		int w=bt.getSize().getWidth();
		System.out.println(h+""+w);
		driver.quit();
		
	}

}
