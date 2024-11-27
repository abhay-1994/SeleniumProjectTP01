package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetWindowHandle {
	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String wid = driver.getWindowHandle();
		System.out.println("Window id -"+wid);
		
	}

}
