package prashanth;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GitHubDemo {
	WebDriver driver;
  @Test
  public void techlearnlogin() {
	  driver.get("https://www.techlearn.in/admin");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }

}
