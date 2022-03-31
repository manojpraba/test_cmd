package xpath_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='10']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		

}
}
