package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfSendKeysWithEnum {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.id("username"));
		userNameTextField.sendKeys(Keys.CONTROL+"A");
		Thread.sleep(2000);
		userNameTextField.sendKeys(Keys.DELETE);
		userNameTextField.sendKeys("admin");
		WebElement pwdTextField = driver.findElement(By.id("password"));
		Thread.sleep(2000);
		pwdTextField.sendKeys(Keys.CONTROL+"A", Keys.DELETE);
		Thread.sleep(2000);
		pwdTextField.sendKeys("admin", Keys.ENTER);
		
		
	}

}
