package xpath_edit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class selectable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='selectable']/*"));
		Actions act=new Actions(driver);
      
//		act.clickAndHold(list.get(0)).build().perform();
//		act.clickAndHold(list.get(2)).build().perform();
		
		///////another method//////////////
		act.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(2)).build().perform();
		
	}

}
