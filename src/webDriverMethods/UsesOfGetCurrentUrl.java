package webDriverMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("facebook")) {
			System.out.println("Web page is verified");
		}else {
			System.out.println("Web page is  not verified");
		}
	}
}
