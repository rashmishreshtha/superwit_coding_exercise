package rs.superwit.selenium;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.PageLoadStrategy;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class GmailLogin {

		public void login(String username, String password) {

			System.setProperty("webdriver.chrome.driver", "C:\\data\\Selenium\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			//trying to overcome google blocking automated script to access gmail account
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("--no-sandbox", "--disable-infobars", "--disable-dev-shm-usage",
					"--disable-browser-side-navigation", "--disable-gpu", "enable-automation");

			WebDriver driver = new ChromeDriver(options);

			driver.manage().window().maximize();

			driver.get("https://gmail.com");

			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("identifierId")));

			driver.findElement(By.id("identifierId")).sendKeys(username, Keys.ENTER);

			driver.findElement(By.name("password")).sendKeys(password, Keys.ENTER);

			driver.close();

		}

	}


