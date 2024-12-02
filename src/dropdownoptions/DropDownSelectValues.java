package dropdownoptions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DropDownSelectValues {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	void dropdown() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/registration/");
		Thread.sleep(2000);
	/*	driver.findElement(By.xpath("//*[@id=\"fullname\"]")).sendKeys("Techlearn");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hello#123");
		driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/label[6]/input")).click();  */
		
		Thread.sleep(2000);
		
		Select co = new Select(driver.findElement(By.xpath("//*[@id=\"countries\"]")));
	//	co.selectByIndex(8);
		co.selectByValue("GB");
	//	co.selectByVisibleText("Australia");
	}

}
