package mavenjenkin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void loginTest()
	{
	driver.get("http://gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("meesha.kmr@gmail.com");
	driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	

}
