package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FileAttachement {
	WebDriver driver;

	@Test
	public void attachfile() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/registration/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='file']")).sendKeys("D:\\Redmine\\Naveen.jpeg");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
