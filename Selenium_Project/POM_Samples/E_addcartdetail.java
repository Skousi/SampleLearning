package POM_Samples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class E_addcartdetail {
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement order;
	@FindBy(id="shopping_cart_container")
	public static WebElement crt;
	@FindBy(id="checkout")
	public static WebElement chko;
	@FindBy(id="first-name")
	public static WebElement use;
	@FindBy(id="last-name")
	public static WebElement luse;
	@FindBy(id="postal-code")
	public static WebElement pins;
	@FindBy(id="continue")
	public static WebElement cons;
	@FindBy(id="finish")
	public static WebElement done;
}
