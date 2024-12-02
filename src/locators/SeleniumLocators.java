package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumLocators {
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	
	void techlearnlogin() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
		driver.findElement(By.id("user_login")).sendKeys("prasadh");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.name("rememberme")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("wp-login-lost-password")).click();
	}
	
	
	@Test
	void techlearnlogincss() throws Exception {
		driver.get("https://www.facebook.com/admin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("Chaithanya");
	//	driver.findElement(By.cssSelector("#user_login")).sendKeys("Chaithanya");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();
	//	driver.findElement(By.cssSelector(".wp-login-lost-password")).click();

		
		
	}
	
	@Disabled
	@Test
	void techlearnloginlinkpartial() throws Exception {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Placements")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Syllabus")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Us")).click();
				
	}
	
	@Disabled
	@Test
	void tagname() throws Exception {
		driver.get("https://www.redmine.org");
		Thread.sleep(1000);
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total images on redmine site :" +images.size());
		//System.out.println(l.size());
		
	
	/*	List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		System.out.println("Total links on NDTV Application :"+links.size()); */
			
	}
	@Disabled
	@Test
	void login() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
		
    	driver.findElement(By.id("user_login")).sendKeys("prasadh");
		Thread.sleep(3000);
		driver.findElement(By.id("user_login")).clear();

		driver.findElement(By.id("user_login")).sendKeys("bharath");
		Thread.sleep(3000);
		
		driver.findElement(By.name("wp-submit")).submit();
	}
	
	@Disabled
	@Test
	void loginform() throws Exception {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
		
   	WebElement user = driver.findElement(By.id("user_login"));
   	user.sendKeys("Dilip");
   	
   	Thread.sleep(3000);
   	
   	WebElement pswd = driver.findElement(By.name("pwd"));
   	pswd.sendKeys("abc");
   	
   	WebElement rem = driver.findElement(By.id("rememberme"));
   	rem.click();
	}
	
	@Disabled
	@Test
	void xpath() throws Exception {
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/form/p[1]/input")).sendKeys("bharath");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rememberme\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/form/p[3]/input[1]")).click();
	
	}

}
