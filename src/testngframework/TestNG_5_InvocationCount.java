package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_5_InvocationCount {
	WebDriver driver;

	@Test(invocationCount=5)
	public void google() {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();		
	}
	
	@Test(invocationCount=3)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}

	@Test
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}

	@Test
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
