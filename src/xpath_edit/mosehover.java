package xpath_edit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mosehover {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("btnMouse"))).build().perform();
		driver.findElement(By.linkText("Selenium")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//driver.manage().
		
	}

}
