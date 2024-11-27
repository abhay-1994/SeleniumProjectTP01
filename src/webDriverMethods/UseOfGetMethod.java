package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();//launch the chrome browser
		driver.get("https://www.facebook.com/");
		
		
	}

}
