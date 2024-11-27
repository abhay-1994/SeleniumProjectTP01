package webElementMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class UsageOfGetCSSValue {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.name("login"));
		String BackgroundColor = loginButton.getCssValue("background-color");
		String hexCode = Color.fromString(BackgroundColor).asHex();
		System.out.println(hexCode);

	}

}
