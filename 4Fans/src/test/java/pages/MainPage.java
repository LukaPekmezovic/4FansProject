package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage {

	public WebDriver driver = null;
	
	By joinAsFanButton = By.linkText("Join as Fan");

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickJoinAsFanButton() {
		driver.findElement(joinAsFanButton).click();
	}
	
	public void open4FansWebsite() {
		
		driver.get("https://4fans.com/");		
	}
	
}
