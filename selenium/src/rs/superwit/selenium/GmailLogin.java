package rs.superwit.selenium;



	import org.junit.Assert;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Class for testing Gmail login using selenium
 */
	public class GmailLogin {
	/**
	 * Method for gmail login using selenium
	 * @param username
	 * @param password
	 */
		public void login(String username, String password) {
			//TODO: chromedriver.exe file path should come from a settings file
			System.setProperty("webdriver.chrome.driver", "C:\\data\\Selenium\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();

			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("--no-sandbox", "--disable-infobars", "--disable-dev-shm-usage",
					"--disable-browser-side-navigation", "--disable-gpu", "enable-automation");

			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://gmail.com");
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
			driver.findElement(By.id("identifierId")).sendKeys(username, Keys.ENTER);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			driver.findElement(By.name("password")).sendKeys(password, Keys.ENTER);
			WebElement actualResult= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Gmail']/img")));
			Assert.assertNotNull("Login successful, in inbox now", actualResult);
			driver.close();

		}

	}


