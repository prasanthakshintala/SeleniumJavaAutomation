package modes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
	
	 driver.get("https://www.techlearn.in");
	 driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[6]/a")).click();
		
		
		
		
		
		
		
		
	}

}
