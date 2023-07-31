package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_loginpage {
	
	@FindBy(id = "user-name")
	public static WebElement usern;
	@FindBy(id = "password")
	public static WebElement passw;
	@FindBy(id = "login-button")
	public static WebElement btn;

}
