package xpath_edit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		//cont nmber of rows in a table
		
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='table_id']//child::tr"));
	System.out.println("Nmber of rows in a table is"+row.size());
	
	// cont the nmnber of colmns in a table
	List<WebElement> col = driver.findElements(By.xpath("//table/tbody//th"));
	System.out.println("The total nmbe of colmns are "+col.size());
	
	String s =driver.findElement(By.xpath("//*[@class ='even']//td//following::td")).getText();
	System.out.println("The vale of learn is "+ s);
	
	driver.quit();	
		
	}

}
