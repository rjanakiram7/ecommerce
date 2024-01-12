package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Equrzlogout {
	WebDriver driver;

	@FindBy(xpath="//*[@class='img-profile rounded-circle __inline-14']")
	public WebElement logouticon;
	@FindBy(xpath="//*[text()='Logout']")
	public WebElement logout;

public Equrzlogout (WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void logout() {
	Actions act=new Actions(driver);
	act.moveToElement(logouticon)
	.moveToElement(logout).click().build().perform();
	
}
	
	
}
