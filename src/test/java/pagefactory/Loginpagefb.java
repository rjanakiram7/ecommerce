package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagefb {
	@FindBy(xpath="//*[@type='text']")
	public WebElement username;
	@FindBy(xpath="//*[@type='password']")
	public WebElement password;
	@FindBy(xpath="//*[@value='1']") public WebElement login;

	public Loginpagefb(WebDriver driver){
		PageFactory.initElements(driver,this);
		
	}
	public void username()  {
		/*try {
			username.sendKeys("jjjjjjjjg");
			Thread.sleep(1000);
			password.sendKeys("123456");
			Thread.sleep(1000);
			login.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		username.sendKeys("jjjjjjjjg");}
		public void password()  {
			password.sendKeys("123456");}
		public void login() {
			login.click();
	}
}
