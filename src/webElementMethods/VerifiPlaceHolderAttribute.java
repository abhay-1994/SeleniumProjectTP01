package webElementMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifiPlaceHolderAttribute {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.id("email"));
	
		String attributeValue = emailTextField.getAttribute("placeholder");
		if(attributeValue.contains("Email")) {
			System.out.println(attributeValue);
		}
		else {
			System.out.println("Place holder is not correct");
		}

	}

}
