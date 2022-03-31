package xpath_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;

public class frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//get total nmber of frames
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='Click']")).click();
		driver.switchTo().parentFrame().switchTo().defaultContent();
		
		//Nested frame
		driver.switchTo().frame(1).switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='Click1']")).click();
		
		
		
	}

}
