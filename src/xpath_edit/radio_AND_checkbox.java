package xpath_edit;

import org.openqa.selenium.By;

import java.nio.channels.WritableByteChannel;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_AND_checkbox {
	public static void main(String[] args) throws Exception 
	
	{
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");					
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("http://www.leafground.com/pages/radio.html");
       //("(//*[@class ='myradio' or id='yes' or vale =1])[1]")
    driver.findElement(By.xpath("(//*[@class ='myradio' or id='yes' or vale =1])[1]")).click();
   WebElement s1 = driver.findElement(By.xpath("//label[@for='Checked']/input[@name ='news' ]"));
   WebElement s2 = driver.findElement(By.xpath("//label[@for='Unchecked']/input[@name ='news' ]"));
   ///gonna find which radio btton is selected by default
   if(s1.isSelected())
   {
	   System.out.println("The Radio btton one is selected");
   }
   else
	   System.out.println("The radio btton 2 is selected");
    
    /// selecting the radio btton only if no btton is selected by default\
   
   List<WebElement> radioButtons =driver.findElements(By.xpath("//label[@for='Checked']/input[@name ='news' ]/following::div[3]/input"));
   int cont=0;
     for(WebElement s :radioButtons) {
    	 if(s.isSelected())
    	 {
    		 cont++;
    	 }
     }
    	 if(cont>0)
    	 {
    		 System.out.println("The radio btton is already selected");
    	 }
    	 else
    	 {
    		 driver.findElement(By.xpath("//label[@for='Checked']/input[@name ='news' ]/following::div[3]/input[1]")).click();
    	 }
    	 
    	 //Check box selection
    	 
    	 
     
  // driver.close();
   
   driver.navigate().to("http://www.leafground.com/pages/checkbox.html");
   driver.findElement(By.xpath("//*[text()='Java']//child::input[@type='checkbox']")).click();
   driver.findElement(By.xpath("//*[text()='Java']//following-sibling::div//child::input[@type='checkbox']")).click();

    
    
}
}
