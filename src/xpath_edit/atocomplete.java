package xpath_edit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class atocomplete {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.findElement(By.xpath("//*[@class='ui-autocomplete-input']")).sendKeys("Selenium");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-autocomplete-input']")));

		List<WebElement> list = driver.findElements(By.xpath("//*[@class='ui-autocomplete-input']"));

		System.out.println("Auto Suggest List ::" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println("the list of ele"+list.get(i).getText());

			if (list.get(i).getText().equalsIgnoreCase("Selenium")) {
				list.get(i).click();
				break;
			}
		}

	}

}
