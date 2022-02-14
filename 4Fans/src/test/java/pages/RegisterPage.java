package pages;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	public WebDriver driver = null;

	
	
	public By username = By.name("name");
	public By password = By.name("password");
	public By email = By.name("email");
	public By switchButton = By.className("option-switch");
	public By joinButton = By.xpath("//*[text()='Join as Fan']");
	
	public String regularUsername = RandomStringUtils.randomAlphanumeric(10);
	public String shortUsername = RandomStringUtils.randomAlphanumeric(3);
	public String longUsername = RandomStringUtils.randomAlphanumeric(17);
	
	public String regularPassword = RandomStringUtils.randomAlphanumeric(10);
	public String shortPassword = RandomStringUtils.randomAlphanumeric(5);
	public String longPassword = RandomStringUtils.randomAlphanumeric(17);
	
	public String randomString = RandomStringUtils.randomAlphanumeric(7);
	public String testEmail =  randomString + "@yahoo.com";


	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}	
	public void testSettings() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public void openRegisterPage() {
		driver.get("https://4fans.com/register");
	}
	public void clickButton(By field) {
		driver.findElement(field).click();
	}
	public void typeInField(By field, String text) {
		driver.findElement(field).sendKeys(text);
	}
	public void deleteFromField(By field) {
		driver.findElement(field).sendKeys(Keys.CONTROL + "a");
		driver.findElement(field).sendKeys(Keys.DELETE);
	}
}