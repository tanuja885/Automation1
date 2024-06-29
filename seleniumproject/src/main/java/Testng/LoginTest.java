package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "Url" })
	public void setup(String Url) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);

		Thread.sleep(3000);
	}

	@Test
	@Parameters({ "Username", "Password" })
	void Login(String UName, String Pwd) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UName);

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pwd);
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

}
