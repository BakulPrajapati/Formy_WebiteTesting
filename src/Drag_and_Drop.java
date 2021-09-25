import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		
		WebElement image = driver.findElement(By.id("image"));
		
		WebElement box = driver.findElement(By.id("box"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(image, box).build().perform();
		
		driver.quit();
		
		
		
	}

}
