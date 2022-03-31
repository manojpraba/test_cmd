package xpath_edit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_webtable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		WebElement table =driver.findElement(By.xpath("//*[@id='table_id']"));
	//	int = table.findElements(By.tagName("td"));
		 int row=table.findElements(By.tagName("tr")).size();
	//	List<WebElement> s1= new ArrayList<WebElement>();
		List<String> s1 =new ArrayList<String>();
		List<String> s2= new ArrayList<String>();
		for(int i=1;i<row;i++)
		{
		
			s1.add(table.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+i+"]/td[2]")).getText());
			//break;
			}
		
		
		
		   Collections.sort(s1);
		   for (String string : s1) {
			
		
			System.out.println(string);
			
		   }
		   System.out.println("===============================================================================");
		 //  s1.clear();
		   Thread.sleep(3000);
		   driver.findElement(By.className("sorting_asc")).click();
		   for(int j=1;j<row;j++)
			{
			
				s2.add(table.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr["+j+"]/td[2]")).getText());
				//break;
				}
		   
		   Collections.sort(s2);
		   for (String string : s2) {
				
				
				System.out.println(string);
				
			   }
		   System.out.println("=========================================================================");
		   boolean boolval = s1.equals(s2); 
		   if(boolval)
		   System.out.println("After sorting the web table all the colmns  are same");
		   else
			   System.out.println("The vales are different");
			
		}
		
	}


