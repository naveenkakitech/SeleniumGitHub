package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class AlertWidnows {
	WebDriver driver;
    @Ignore
	@Test
	public void alertokbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}
    @Ignore
	@Test
	public void alertcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

	@Test
	public void alertsendtextokcancelbutton() throws InterruptedException {
		driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(3000);
		
		//Alert a = driver.switchTo().alert();
	//	a.sendKeys("Chaithanya");
	//	a.accept();

		 driver.switchTo().alert().sendKeys("Lava Kumar");
		 driver.switchTo().alert().accept();

	}
	
	
	@Test
	public void noalertwindow() throws InterruptedException {
		driver.get("https://www.techlearn.in/");
		Thread.sleep(3000);	
		
		Alert a = driver.switchTo().alert();	
		a.accept();

		// driver.switchTo().alert().sendKeys("Lava Kumar");
		// driver.switchTo().alert().accept();

	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
