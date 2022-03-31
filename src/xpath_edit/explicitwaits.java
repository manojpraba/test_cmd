package xpath_edit;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/disapper.html");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='disappear']//following::div//p//strong")));
//		    
//		   // System.out.println("the visible text is "+ 
//		 String s=driver.findElement(By.xpath("//*[@class='disappear']//following::div//p//strong")).getText();
//		 System.out.println("the visible text is "+s);
//		  //*[@class='disappear']//following::div//p//strong"
////		 driver.quit();
////		 
//		 ////////////////////////////////////////////////////////////////////////
//		 driver.navigate().to("http://www.leafground.com/pages/appear.html");
//		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//		    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
//		    
//		   // System.out.println("the visible text is "+ 
//		 String s1=driver.findElement(By.id("btn")).getText();
//		 System.out.println("the visible text is "+s1);
//		 
//	////////////=============================////////////////////////////
//		 //text change //
//		 
//		 driver.get("http://www.leafground.com/pages/TextChange.html");
//		 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
//		    wait2.until(ExpectedConditions.alertIsPresent(By.xpath("//*[text()='Click ME!']")));
//		    
//		   // System.out.println("the visible text is "+ 
//		 String s2=driver.findElement(By.xpath("//*[text()='Click ME!']")).getText();
//		 System.out.println("the visible text is "+s2);
//		 driver.findElement(By.xpath("//*[text()='Click ME!']")).click();
//		  Alert alert=driver.switchTo().alert();
//		 
//		  System.out.println(" alert.getText()"+ alert.getText());
		  /////////////////////////////////////////////////////////////////===================////////////////////////
		//  Wait for alert message /////////
		driver.get("http://www.leafground.com/pages/alertappear.html");
		  driver.findElement(By.id("alert")).click();
		   WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
           wait3.until(ExpectedConditions.alertIsPresent());

           Alert alert2 = driver.switchTo().alert();
           System.out.println("Alert box text "+ alert2.getText());
           alert2.accept();
		  
	}

}
