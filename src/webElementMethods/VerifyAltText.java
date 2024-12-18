package webElementMethods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAltText {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement image = driver.findElement(By.xpath("//a[@aria-label='Microwaves']//img"));
		@Nullable
		String alternativeText = image.getAttribute("alt");
		System.out.println(alternativeText);

	}

}
