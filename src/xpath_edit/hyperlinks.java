package xpath_edit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinks {
	
   public static void main(String[] args) throws MalformedURLException, IOException
   {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");					
    WebDriver driver;
    driver = new ChromeDriver();
    driver.get("http://www.leafground.com/pages/Link.html");
    driver.findElement(By.xpath("(//*[text()='Go to Home Page'])[1]")).click();
    
    driver.navigate().back();
    ///gonna find the broken links 
    String yrl =driver.findElement(By.xpath("//*[text()='Verify am I broken?']")).getAttribute("href");
    System.out.println(yrl);
   
		HttpURLConnection huc = null;
		int respCode =0;
		huc = (HttpURLConnection)(new URL(yrl).openConnection());
		
		huc.setRequestMethod("HEAD");
		
		huc.connect();
		
		respCode = huc.getResponseCode();
		
		if(respCode >= 400){
		    System.out.println(yrl+" is a broken link");
		}
		else{
		    System.out.println(yrl+" is a valid link");
		}
		
		
	
    
    
  
   }
}
