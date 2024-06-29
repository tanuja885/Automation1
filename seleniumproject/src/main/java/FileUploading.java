import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement buttonChoosefile = driver.findElement(By.id("uploadfile"));
		buttonChoosefile.sendKeys("C:\\Users\\HP\\Desktop\\uploadfile path\\tt.txt");


	}

}
