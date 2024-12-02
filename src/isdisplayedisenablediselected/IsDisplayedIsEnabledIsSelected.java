package isdisplayedisenablediselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class IsDisplayedIsEnabledIsSelected {
	WebDriver driver;

	@Test
	public void isDisplayedMethod() throws Exception {
		
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
		
		boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();
		
		if(lyp==true)
		{
			System.out.println("Lost your password link is displayed in login page");
			driver.findElement(By.xpath("//*[@id=\"nav\"]/a")).click();
		}
		
		else
		{
			System.out.println("Lost your password link is Not displayed in login page");
		}
	}
	
	@Ignore
	@Test
	public void isEnabledMethod() throws Exception {
		
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
		
		boolean usrem = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();
		
		if(usrem==true)
		{
			System.out.println("User name text box is enabled to enter the username or email");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("prasadh");
		}
		
		else
		{
			System.out.println("Username text box is NOT enabled to enter the username or email address");	
		}
	}
	
	@Test
	public void isSelectedMethod() throws Exception {
		
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		
		boolean checkbox = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();
		
		if(checkbox==true)
		{
			System.out.println("Remember me checkbox is Selected");
		}
		
		else 
		{
			System.out.println("Remember me checkbox is Not Selected");	
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
