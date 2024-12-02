package actionsclassprograms;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMOKF {
	WebDriver driver;

	@Test
	public void rightclick() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='ABOUT US']"))).build().perform();
	}
	
	@Test
	public void doubleclick() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/double-tap/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	//	act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();
		
	}
	
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/drag-and-drop/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
		
		act.dragAndDrop(source, target).build().perform();
	}
	
	@Test
	public void mouseover() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).build().perform();
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Versions']"))).click().build().perform();
		
	//	driver.findElement(By.xpath("//a[normalize-space()='Versions']")).click();
	}
	
	@Test
	public void keyboardfunctions() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/registration/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys("Prasadh");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	//	act.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
