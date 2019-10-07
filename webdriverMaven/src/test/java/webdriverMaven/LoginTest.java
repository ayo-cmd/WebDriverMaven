package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ayo\\Desktop\\Webdrivers\\ChromeDriver_directory\\chromedriver.exe");
		driver =new ChromeDriver();
		
		
	}
	
	@Test
	public void doLogin(){
		driver.get("http://www.asda.co.uk/");
		driver.findElement(By.className("search-select")).click();
		
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}

}
