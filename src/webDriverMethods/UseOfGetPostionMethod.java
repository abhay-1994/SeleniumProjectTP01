package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetPostionMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Point postion = driver.manage().window().getPosition();
		int xAxis = postion.getX();
		int yAxis = postion.getY();
		System.out.println(xAxis+"  "+yAxis);
	}
}
