package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_6_DescriptionFeature {
	WebDriver driver;

	@Test(description="Verify Selenium Application")
	public void TestCaseOne() {
		driver.get("https://www.selenium.dev");
	}

	@Test(description="Verify Facebook")
	public void TestCaseTwo() {
		driver.get("www.facebook.com");
	}

	@Test(description="Verify Twitter Application")
	public void TestCaseThree() {
		driver.get("https://www.x.com");
	}

	@Test(description="Verify Google Application")
	public void TestCaseFour() {
		driver.get("https://www.google.com");
	}

	@Test(description="Verify Techlearn Application")
	public void TestCaseFive() {
		driver.get("www.techlearn.in");
	}

	@Test(description="Verify Gmail Application")
	public void TestCaseSix() {
		driver.get("www.gmail.com");
	}

	@Test(description="Verify Zomato Application")
	public void TestCaseSeven() {
		driver.get("https://www.zomato.com");
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	

}
