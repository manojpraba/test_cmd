package xpath_edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class btton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");					
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");
        driver.findElement(By.xpath("//*[text()='Go to Home Page']")).click();
       // Thread.sleep(10000);
        driver.navigate().back();
      //  driver.close();
        String colo =driver.findElement(By.id("color")).getCssValue("color");
        System.out.println("the color is "+colo);
     String c =Color.fromString(colo).asHex();
     System.out.println(c);
   int height = driver.findElement(By.id("size")).getSize().getHeight();
   int with = driver.findElement(By.id("size")).getSize().getWidth();
   System.out.println("The heighr and weifhr is "+ height+"   "+with);

	}

}
