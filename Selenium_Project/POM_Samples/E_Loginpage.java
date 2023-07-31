package POM_Samples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class E_Loginpage {
	
	 @FindBy(id ="user-name")
	 public static WebElement username;
	 @FindBy(how=How.ID,using = "password")  
	 public static WebElement password;
	 @FindBy(id="login-button")
	 public static WebElement logbot;
	
}
