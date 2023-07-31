package Advanced;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotinmyw {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/grid.xhtml");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\kousa\\OneDrive\\Pictures\\Saved Pictures\\src.png");
		FileHandler.copy(src, dest); // Fileutils.copyfile(src, dest)
		
		Robot robo=new Robot();
		Dimension srcc=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(srcc);
		robo.createScreenCapture(rectangle);
		BufferedImage img=robo.createScreenCapture(rectangle);
		File desti= new File("C:\\Users\\kousa\\OneDrive\\Pictures\\Saved Pictures\\src1.png");
		ImageIO.write(img, "png", desti);
		driver.quit();
	}

}
