package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegisterPage;

public class RegisterPageTest {
	
private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		chromeDriverSetup();
		
		RegisterPage registerPageObj = new RegisterPage(driver);
		
		registerPageObj.testSettings();
		
		registerPageObj.openRegisterPage();
		
		registerPageObj.clickButton(registerPageObj.switchButton);
		
		registerPageObj.typeInField(registerPageObj.username, registerPageObj.shortUsername);
			delay();			
		registerPageObj.typeInField(registerPageObj.password, registerPageObj.shortPassword);
			delay();	
		registerPageObj.typeInField(registerPageObj.email, registerPageObj.testEmail);
			delay();
				
		registerPageObj.deleteFromField(registerPageObj.username);
			delay();		
		registerPageObj.deleteFromField(registerPageObj.password);
			delay();
		registerPageObj.deleteFromField(registerPageObj.email); 
			delay(); 
			
		registerPageObj.typeInField(registerPageObj.username, registerPageObj.longUsername);
			delay();			
		registerPageObj.typeInField(registerPageObj.password, registerPageObj.longPassword);
			delay();			
		registerPageObj.typeInField(registerPageObj.email, registerPageObj.testEmail);
			delay();
			
		registerPageObj.deleteFromField(registerPageObj.username);
			delay();		
		registerPageObj.deleteFromField(registerPageObj.password);
			delay();
		registerPageObj.deleteFromField(registerPageObj.email);
			delay();
			
		registerPageObj.typeInField(registerPageObj.username, registerPageObj.regularUsername);
			delay();			
		registerPageObj.typeInField(registerPageObj.password, registerPageObj.regularPassword);
			delay();			
		registerPageObj.typeInField(registerPageObj.email, registerPageObj.testEmail);
			delay();
			
		registerPageObj.clickButton(registerPageObj.joinButton);		
		
	}
	
	private static void delay() throws InterruptedException {
			Thread.sleep(1000);
	}
		
	private static void chromeDriverSetup(){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	}
		
}
