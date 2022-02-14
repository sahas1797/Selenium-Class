import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String [] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://www.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		WebDriverWait w= new WebDriverWait(driver,50L);
		
		WebElement we= w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
		
		we.click();
		
		
	}
}
