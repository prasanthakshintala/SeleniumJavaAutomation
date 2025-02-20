package modes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	 driver.get("https://www.techlearn.in");
	 driver.findElement(By.xpath("//*[@xpath='About Us']")).click();
		
		
		
		
		
		
		
		
	}

}
