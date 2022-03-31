package xpath_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_downand_upload {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.xpath("//*[contains(text(),'Download Excel')]")).click();
		Thread.sleep(3000);
		driver.quit();
//		driver.get("http://www.leafground.com/pages/upload.html");
//		driver.findElement(By.name("filename")).sendKeys("C:\\Users\\NOVA SURYA\\Pictures\\app_feature\\search.feature");
//		
	}

}
