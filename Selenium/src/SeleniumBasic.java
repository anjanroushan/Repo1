import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasic {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium jars2.42\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		driver.quit();
		System.out.println("Quit the browser");

	}

}
