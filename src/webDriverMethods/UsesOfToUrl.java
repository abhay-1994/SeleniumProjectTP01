package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsesOfToUrl {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.dassault-aviation.com/en");
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		driver.navigate().to(mainUrl);
		Thread.sleep(3000);
		URL groupPage = new URL(mainUrl,"group/");
		driver.navigate().to(groupPage);
		driver.navigate().back();
		
		URL civilPage = new URL(mainUrl,"civil/");
		driver.navigate().to(civilPage);
	}

}
