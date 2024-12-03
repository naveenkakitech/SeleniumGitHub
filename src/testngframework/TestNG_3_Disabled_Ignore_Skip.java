package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Disabled_Ignore_Skip {
	WebDriver driver;

	@Test(priority=5)
	public void seleniumdev() {
		driver.get("https://www.selenium.dev");
	}

	@Ignore
	@Test(priority=6)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}

	@Test(priority=1, enabled=true)
	public void twitter() {
		driver.get("https://www.x.com");
	}

	@Test(enabled=false, priority=0)
	public void google() {
		driver.get("https://www.google.com");
	}

	@Test(priority=3)
	public void techlearn() {
		driver.get("https://www.techlearn.in");
	}

	@Test(enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}

	@Test(priority=4, enabled=true)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
	}

}
