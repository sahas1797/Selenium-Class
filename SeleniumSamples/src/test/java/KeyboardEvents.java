import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Sahas");
		 
		Thread.sleep(3000L);
		
		//presses control and A from keyboard
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL,"A");
		
		Thread.sleep(3000L);
		
		//presses backspace from keyboard
		driver.findElement(By.id("email")).sendKeys(Keys.BACK_SPACE);
	}

}
