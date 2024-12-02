package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	WebDriver driver;

	@Test
	public void googlesearch() throws InterruptedException {
		
		Logger log= Logger.getLogger("Search Funtionality");
		PropertyConfigurator.configure("Log4j.properties");
		
	

		
		
		driver.manage().window().maximize();
		log.info("Browser window maximized");
		
		driver.get("https://www.google.com");
		log.info("Navigate to the Google Application");
		
		driver.findElement(By.name("q")).sendKeys("Techlearn.in");
		log.info("In google search field Techlearn.in text typed");
		
		Thread.sleep(2000);
		log.info("Wait for 2 seconds");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter button pressed in keyboard");

	}
}
