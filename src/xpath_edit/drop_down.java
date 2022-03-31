package xpath_edit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NOVA SURYA\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Select dr1 = new Select(driver.findElement(By.id("dropdown1")));
		dr1.selectByIndex(0);
		Select dr2 = new Select(driver.findElement(By.name("dropdown2")));
		dr2.selectByValue("4");
		Select dr3 = new Select(driver.findElement(By.id("dropdown3")));
		dr3.selectByVisibleText("UFT/QTP");

		/// getting/pritining  list of options in drop down
		Select dr4 = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> options = dr4.getOptions();
		for (WebElement el : options) {
			System.out.println(el.getText());
		}

		/// selecting multiple vales

		WebElement select1 = driver
				.findElement(By.xpath("//select[@class='dropdown']/following::div[2]/select/option[2]"));
		WebElement select2 = driver
				.findElement(By.xpath("//select[@class='dropdown']/following::div[2]/select/option[5]"));
		Actions action = new Actions(driver); //
		action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();

	}

}
