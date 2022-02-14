import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://omayo.blogspot.com/");
		
		//maximizez the browser
		driver.manage().window().maximize();
		
		//dorpdown is located 
		Select s= new Select(driver.findElement(By.name(("SiteMap"))));
		
		Thread.sleep(3000L);
		
		s.selectByValue("mno");
	}

}
