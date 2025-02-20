package modes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cards {
 static WebDriver driver;
	public static void main(String[] args) {
	driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com");
driver.navigate().to("https://www.phonepe.com");


 try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.navigate().back();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.navigate().forward();
driver.manage().window().minimize();
driver.close();

	}

}
