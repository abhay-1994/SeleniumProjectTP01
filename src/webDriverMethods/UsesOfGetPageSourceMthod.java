package webDriverMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetPageSourceMthod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
