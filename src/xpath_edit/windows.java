package xpath_edit;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");

		driver.findElement(By.id("home")).click();

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String s : child) 
			
		{
			if (!s.equalsIgnoreCase(mainWindowHandle)) {
				driver.switchTo().window(s);
				driver.findElement(By.xpath("//*[@class='wp-categories-icon svg-image' and @src ='images/edit.png']"))
						.click();
				driver.findElement(By.id("email")).sendKeys("manoj");
				driver.findElement(By.xpath("//*[@value='Append ']")).sendKeys("manoj");
				driver.close();

			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(mainWindowHandle);
		driver.findElement(By.xpath("//*[@onclick='openWindows()']")).click();
		Set<String> mlti =driver.getWindowHandles();
		System.out.println("The opened windows is "+ mlti.size());
		driver.close();
	///Wait to open new windows
		driver.switchTo().window(mainWindowHandle);
		driver.findElement(By.xpath("//*[@onclick='openWindowsWithWait();']")).click();
		Set<String> wait = driver.getWindowHandles();
		for (String wa : wait) {
			if (!wa.equalsIgnoreCase(mainWindowHandle))
			{
				driver.switchTo().window(wa);
				//driver.close();
			}
			driver.close();
			
		}
		
	}
}
