import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class ReadExcelSheet {

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		
	File file=new File ("C:\\Users\\HP\\Documents\\Office\\Book1.xlsx"); 
	
    XSSFWorkbook wk =new XSSFWorkbook (file);
	
	//XSSFSheet Sheet = wk.getSheetAt(1);     // by index
	XSSFSheet Login = wk.getSheet("Login"); // by Name 
	
	String U= Login.getRow(1).getCell(0).getStringCellValue();
	String P = Login.getRow(1).getCell(1).getStringCellValue();
	System.out.println("tanujadhumal");
	System.out.println("tanu@1234");
	WebDriver driver= new ChromeDriver();
	driver.get("https://omayo.blogspot.com");
	
	WebElement TextboxUserName = driver.findElement(By.name("userid"));
	TextboxUserName.sendKeys("tanujadhumal");
	WebElement TextboxPassword = driver.findElement(By.name("pswrd"));
	TextboxPassword.sendKeys("tanu@1234");
	WebElement ButtonL = driver.findElement(By.name("(//input[@type='button'])[1]"));
	ButtonL.click(); 
	
	
	
	
	
	
	

			
		
		


	}

}
 