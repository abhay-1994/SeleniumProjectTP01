package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetRectMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
		Rectangle rectangle = emailTextField.getRect();
		int emailTFHeight = rectangle.getHeight();
		System.out.println(emailTFHeight);
		

	}

}