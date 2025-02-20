package prashanth;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GitHubDemo {
	WebDriver driver;
  @Test
  public void techlearnlogin() {
	  driver.get("https://www.techlearn.in/admin");
	  driver.findElement(By.xpath("//*[@name=\"log\"]")).sendKeys("prashanth");
	  driver.findElement(By.xpath("//*[@name=\"pwd\"]")).sendKeys("Hello@123");
	  driver.findElement(By.xpath("//*[@name=\"rememberme\"]")).click();
	  driver.findElement(By.id("wp-submit")).click();
  }
  
  @Test
  public void techlearnlostyourpassword() {
	  driver.get("https://www.techlearn.in/admin");	
	  driver.findElement(By.className("wp-login-lost-password")).click();
	  driver.findElement(By.xpath("//*[@name=\"user_login\"]")).sendKeys("prasanthakshintala96@gmail.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
