package TestNg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class excelRead {
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
	}
	@Test
	public void sauce() throws InterruptedException, IOException {
		FileInputStream filepath=new FileInputStream("D:\\Learning\\sample.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(filepath);
		XSSFSheet sheet= book.getSheet("Sheet1");
		int rowcount= sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=1;i<=rowcount;i++) {
			String us=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(us);
			WebElement users=driver.findElement(By.id("user-name"));
			users.sendKeys(us);
			String ps=sheet.getRow(i).getCell(1).getStringCellValue();
			WebElement pass=driver.findElement(By.id("password"));
			pass.sendKeys(ps);
			System.out.println(ps);
			WebElement but=driver.findElement(By.id("login-button"));
			but.click();
			driver.navigate().refresh();
		}

	}


}
