package webDriverMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetTilteMethod {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		System.out.println("Title of the web page is -"+title);
		if(title.contains("Selenium")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
	}

}
