package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod {

	public static void main(String[] args) throws Throwable
 {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		boolean stateOfButton = submitButton.isEnabled();
		if(stateOfButton) {
			submitButton.click();
		}
		else {
			System.out.println("Submit button is not enabled");
			driver.findElement(By.xpath("//button[text()='Accept Terms of Service']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Close']")).click();
			Thread.sleep(2000);
			submitButton.click();
			
		}

	}

}
