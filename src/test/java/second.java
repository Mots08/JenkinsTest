import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class second {
	static WebDriver driver;
	static By searchElement = By.name("q");

	@BeforeTest
	public static void inicio() {
		System.setProperty("webdriver.chrome.driver", "/home/pc-01/Downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		driver = new ChromeDriver(options);
	}

	@Test
	public static void login() {
		driver.get("https://www.facebook.com");
	}
	@AfterTest
	public static void finalizar() {
		driver.quit();
	}

}
