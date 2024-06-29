package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestng {
	
	WebDriver driver;
	@Test
	
	public void TextBox1() {
		driver.findElement(By.xpath("//form[@name='form1']//input[1]")).sendKeys("Enter User Name");
	}
	@Test
	
	public void TextBox() {
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Enter Password");
	}
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
