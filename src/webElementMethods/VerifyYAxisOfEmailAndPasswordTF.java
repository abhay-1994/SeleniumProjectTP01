package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyYAxisOfEmailAndPasswordTF {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Email
		WebElement emailTextField = driver.findElement(By.id("email"));
		Point emailTextFieldLocation = emailTextField.getLocation();
		int emailStartingyAxis = emailTextFieldLocation.getX();
		System.out.println("emailStartingyAxis ="+emailStartingyAxis);
		//Password
		WebElement passwordTextField = driver.findElement(By.id("passContainer"));
		Point passwordTextFieldLocation = passwordTextField.getLocation();
		int passwordStartingYAxis = passwordTextFieldLocation.getX();
		System.out.println("passwordStartingYAxis ="+passwordStartingYAxis);
		
		if(emailStartingyAxis==passwordStartingYAxis) {
			System.out.println("Email and Password Text field are stating at the same point");
			
		}
		System.out.println("Email and Password Text field are not starting at the same point");
	}

}
