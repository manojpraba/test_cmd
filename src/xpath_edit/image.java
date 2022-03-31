package xpath_edit;

import java.io.IOException;
import java.net.MalformedURLException;

//import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.http.HttpClient;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.openqa.selenium.By;
import java.net.URL;

public class image {
	public static void main(String[] args) throws ClientProtocolException, IOException
	   {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");					
	    WebDriver driver;
	    driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Image.html");
	
	 driver.findElement(By.xpath("//div[@class ='large-6 small-12 columns']/label/following::img[@src ='../images/home.png']")).click();
	  driver.navigate().back();
	  
		WebElement img =driver.findElement(By.xpath("//img[@src ='../images/abcd.jpg']"));
		    /// find broken images 
		   try {
		    HttpClient client = HttpClientBuilder.create().build();
		    HttpGet request = new HttpGet(img.getAttribute("src"));
		    HttpResponse response = client.execute(request);
		    if (response.getStatusLine().getStatusCode() >=400)
		    {
		        System.out.println(" is broken.");

}
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//img[@src ='../images/home.png']
//(//div/img)[1]
////div[@class ='large-6 small-12 columns']/label/following::img
