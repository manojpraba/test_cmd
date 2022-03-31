package xpath_edit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
	    alert1.accept();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
	    Alert aler3=driver.switchTo().alert();
	    aler3.sendKeys("manoj");
	    aler3.accept();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
	     Alert alert4 = driver.switchTo().alert();
	       System.out.println(alert4.getText());
	       alert4.dismiss();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//button[@onclick='sweetalert()']")).click();
	       Thread.sleep(3000);
	     //  Alert alert5 = driver.switchTo().alert();
	       String MainWindow=driver.getWindowHandle();
	       
	    // System.out.println(MainWindow);
	      // System.out.println(alert5.getText());
	    //   alert5.accept();
	  driver.quit();
	}

}
