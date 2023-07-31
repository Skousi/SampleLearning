package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		uploadfile up = new uploadfile();
		up.ups1();
		up.ups2();//oldway

	}
	public void ups1() throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.leafground.com/grid.xhtml");
		WebElement file2 = driver.findElement(By.id("form:j_idt92_input"));
		file2.sendKeys("C:\\Users\\kousa\\Downloads\\a1h98arp.png");
		Thread.sleep(2000); 
		WebElement downs = driver.findElement(By.id("form:j_idt93")); 
		downs.click(); 
		Thread.sleep(3000);
		driver.close(); 
	}

	public void ups2() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/grid.xhtml");
		WebElement file2 = driver.findElement(By.id("form:j_idt92"));
		file2.click();
		StringSelection selection =new StringSelection("C:\\Users\\kousa\\Downloads\\a1h98arp.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(3000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL); //VK-virtural keyboard
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.close();
	}

} 