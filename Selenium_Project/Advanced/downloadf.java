package Advanced;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		downloadf downs=new downloadf();
		downs.downf();

	}
	public void downf() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Learning\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://getsamplefiles.com/sample-document-files/pdf");
		driver.manage().window().maximize();
		WebElement dow=driver.findElement(By.xpath("/html/body/main/main/div/div[2]/div/ul/li[1]/div/div[2]/a"));
		dow.click();
		Thread.sleep(2000);
		File fileloc=new File("C:\\Users\\kousa\\Downloads");
		File[] total=fileloc.listFiles();
		for (File file : total) {
			if(file.getName().equals("sample-1.pdf")) {
				System.out.println("file downloaded successfully");
				break;
			}
		}
		driver.quit();
	}

}
