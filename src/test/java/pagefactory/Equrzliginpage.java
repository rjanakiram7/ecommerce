package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Equrzliginpage {
	WebDriver driver;
	
	
	@FindBy(xpath="(//*[@class='form-control'])[1]")
	public WebElement email;
	@FindBy(xpath="(//*[@class='form-control'])[2]")
	public WebElement password;
	@FindBy(xpath="//*[@class='mr-1']")
	public WebElement checkbox;
	@FindBy(xpath="//*[@class='btn btn--primary btn-block btn-shadow']")
	public WebElement login;
	@FindBy(xpath="(//*[@class='dropdown-item'])[3]")
	public WebElement logout;
	@FindBy(xpath="//*[@width='16']")
	public WebElement signicon;
	@FindBy(xpath="//*[@class='img-profile rounded-circle __inline-14']")
	public WebElement logoution;
	
	public Equrzliginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void email() {
		//email.sendKeys("gopikrishnaedupuganti.marolix@gmail.com");
		try {
			email.sendKeys("gopikrishnaedupuganti.marolix@gmail.com");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
	}
	public void password() {
		try {
			password.sendKeys("7660804093");
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		//password.sendKeys("7660804093");
	}
	
	public void checkbox() {
		try {
			checkbox.isSelected();
			Thread.sleep(7000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	 
	}
	public void login() {
		try {
			login.click();
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}}
		
			
			
		}
		
	

