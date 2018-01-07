import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumBasicTest {

  @Test
  public void main() {
    
	  System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars2.42\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		driver.quit();
		System.out.println("Quit the browser");
  }
}
