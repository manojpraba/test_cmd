package xpath_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandsort {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().fullscreen();
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath("//li[text()='Item 7']"))).
		clickAndHold().
		moveToElement(driver.findElement(By.xpath("//li[text()='Item 1']")))
		.release()
		.build()
		.perform();
		Thread.sleep(3000);
		action.click(driver.findElement(By.xpath("//li[text()='Item 6']"))).
		clickAndHold().
		moveToElement(driver.findElement(By.xpath("//li[text()='Item 4']")))
		.release()
		.build()
		.perform();
		
		
	}

}
