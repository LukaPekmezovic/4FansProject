package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MainPage;

public class JoinAsFanButtonTest {
	
private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		chromeDriverSetup();
		
		MainPage mainPageObj = new MainPage(driver);
	
		
		mainPageObj.open4FansWebsite();
			delay();
			
		mainPageObj.clickJoinAsFanButton();
		
	}
	
	private static void delay() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	private static void chromeDriverSetup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}
