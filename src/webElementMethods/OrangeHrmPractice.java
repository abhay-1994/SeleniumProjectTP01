package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement userNameTextField = driver.findElement(By.name("username"));
		userNameTextField.sendKeys("Admin");
		//Thread.sleep(2000);
		WebElement pwdTextField = driver.findElement(By.name("password"));
		pwdTextField.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath(" //button[contains(.,'Login')]"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement profileOption = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		profileOption.click();
		Thread.sleep(2000);
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		
		
		

	}

}
