package demoTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_JUnit {

	 WebDriver driver;
	 @BeforeClass
	 public static void beforeClass() {
		System.out.println("This is Before class"); 
	 }
	 @AfterClass
	 public static void afterClass() {
		 System.out.println("This is After class"); 
	 }
	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		
		 driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		System.out.println("This before");
	}

	@Test
	public  void testLogin() throws InterruptedException {

		
//		identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	System.out.println("test1");
		
	}
	@Test
	public  void testLoginNeg() throws InterruptedException {

		
//		identify element
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123000");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	System.out.println("test2");
		
	}
	
	@After
	public  void tearDown() {
		
		
		driver.close();
		driver.quit();
		System.out.println("This is after");
	}
	
}
