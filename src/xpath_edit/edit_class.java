package xpath_edit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class edit_class {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");					
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.leafground.com/home.html");
      //  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
        //email 
        driver.findElement(By.id("email")).sendKeys("manoj");
     driver.findElement(By.xpath("//*[@value='Append ']")).sendKeys("manoj");
  String s =  driver.findElement(By.xpath("//*[@name='username']")).getAttribute("value");
		   //getText().toString();
  System.out.println("the va;ue of text is "+ s);
  driver.findElement(By.xpath("//*[@value='Clear me!!']")).clear();
   Thread.sleep(1000);
   //chekc is the text field is enabled/disabled
   
 boolean boo =  driver.findElement(By.xpath("//*[@disabled='true']")).isEnabled();
 
System.out.println(boo);
//retrn to the home page 
    driver.navigate().back();
    
 //  driver.quit();
}
}

