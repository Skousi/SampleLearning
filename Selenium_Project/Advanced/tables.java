package Advanced;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions maxi=new ChromeOptions().addArguments("--Start-maximized");
		WebDriver driver= new ChromeDriver(maxi);
		driver.get("https://www.leafground.com/dashboard.xhtml");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		List<WebElement>columns=driver.findElements(By.xpath("//*[@id=\'j_idt154_content\']//ancestor::th"));
		int cols=columns.size();
		System.out.println(cols);
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\'j_idt154_content\']//ancestor::tr"));
		int row=rows.size();
		System.out.println(row);
		
		//xpath
		WebElement active=new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(
				(By.xpath("//td[normalize-space()='USA']//following::td[2]"))));
		String act=active.getText();
		System.out.println(act);
		
		List<WebElement> change=driver.findElements(By.xpath("//*[@id=\'j_idt154_content\']//td[3]"));
		List<Integer> numberlist=new ArrayList<Integer>();
		
		for (WebElement webElement : change) {
			String induvidualvalue=webElement.getText().replace("%", "");
			numberlist.add(Integer.parseInt(induvidualvalue));
			
		}
		System.out.println(numberlist);
		int smallv=Collections.min(numberlist);
		System.out.println(smallv);
		
		
	}

}
