package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionInTestng {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
		driver.manage().window().maximize();
	}

	@Test
	void verifytitle() {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "https://omayo.blogspot.com/");//asserts equalsvalidatios for expected values and for right values

	}

	@Test
	void VerifiyText() {
		WebElement text = driver
		.findElement(By.xpath("//div[text()[normalize-space()='This is a sample text in the Page One.']]"));//assert true validation is used for only true conditions
		Assert.assertTrue(text.isDisplayed());
	}

	@Test
	void verifyTextFalse() {

		WebElement text = driver
				.findElement(By.xpath("//div[text()[normalize-space()='This is a sample text in the Page One.']]"));//Asserts False validation is use for false conditons
		Assert.assertFalse(!(text.isDisplayed()));
	}
		
    @AfterClass
	void TearTown() {
		
		driver.quit();

	}

}
