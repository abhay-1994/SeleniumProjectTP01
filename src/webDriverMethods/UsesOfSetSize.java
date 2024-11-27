package webDriverMethods;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfSetSize {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension definedSize= new Dimension(300, 350);
		driver.manage().window().setSize(definedSize);
		

	}

}
