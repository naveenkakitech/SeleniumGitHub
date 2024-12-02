package verifytabtexturlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class VerificationMethods {
	WebDriver driver;

	@Test
	public void verifyTabtitletext() {
		driver.get("https://www.google.com");

		String exptabtext = "Google";
		System.out.println("Expected tab Text is :" + exptabtext);

		String acttabtext = driver.getTitle();
		System.out.println("Actual Tab Title text is :" + acttabtext);
		
		Assert.assertEquals(acttabtext, exptabtext);
	}
	@Ignore
	@Test
	public void verifyAppURL() {
		driver.get("https://www.google.com");
		
		String expurl = "https://www.google.com/";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);
		
	}
	@Ignore
	@Test
	public void verifyAppText() {
		driver.get("https://www.google.com");
		
		String expgtext = "Gmail";		
		String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();		
		Assert.assertEquals(actgtext, expgtext);
		
		
		String expimgtext = "Images";		
		String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();		
		Assert.assertEquals(actimgtext, expimgtext);
		
		
	}
	@Ignore
	@Test
	public void verifyTabtitletextDemo() {
		driver.get("https://www.google.com");

	//	String exptabtext = "Google";
	//	System.out.println("Expected tab Text is :" + exptabtext);

	//	String acttabtext = driver.getTitle();
	//	System.out.println("Actual Tab Title text is :" + acttabtext);
		
		Assert.assertEquals(driver.getTitle(), "Google");
	}
	




	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
