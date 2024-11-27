package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeMethod {
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		//FirstName
		WebElement firstNameTextField = driver.findElement(By.name("firstname"));
		Dimension fNameTFsize = firstNameTextField.getSize();
		int firstNameTfHeight = fNameTFsize.getHeight();
		int firstNameTfWidth = fNameTFsize.getWidth();
		System.out.println("firstNameTfHeight ="+firstNameTfHeight);
		System.out.println("firstNameTfWidth ="+firstNameTfWidth);
		
		//SURName
		WebElement lastNameTf = driver.findElement(By.name("lastname"));
		Dimension lastNameTfSize = lastNameTf.getSize();
		int lastNameTfHeight = lastNameTfSize.getHeight();
		int lastNameTfWidth = lastNameTfSize.getWidth();
		System.out.println("lastNameTfHeight ="+lastNameTfHeight);
		System.out.println("lastNameTfWidth ="+lastNameTfWidth);
		
		if(firstNameTfHeight==lastNameTfHeight && firstNameTfWidth==lastNameTfWidth) {
			System.out.println("First name TF an Last Name TF size are matching and found correct");
		}
		else {
			System.out.println("First name TF an Last Name TF size are Not matching");

		}
		
	}

}
