package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetSize {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/");
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height+" "+width);


	}

}
