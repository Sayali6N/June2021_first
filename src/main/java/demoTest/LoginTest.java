package demoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		//Positive test scenario.
		launchBrowser();
		testLogin();
		tearDown();
		//Negative test scenario.
		launchBrowser();
		testLoginNeg();
		tearDown();
	}
	
	public static void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Sayali\\selenium\\Selenium_Workspace\\Session_1_crm\\driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	
	public static void tearDown() {
		
		
		driver.close();
	}
	
	public static void testLogin() throws InterruptedException {

		
//		identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	
		
	}
	
	public static void testLoginNeg() throws InterruptedException {

		
//		identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123000");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	
		
	}
	
	

}
