import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://demoqa.com/frames");
		
		//storing the located iframe element into 'c'
		WebElement c= driver.findElement(By.cssSelector("iframe[id='frame2']"));
		
		///switching to frame ' c'
		driver.switchTo().frame(c);
		
		System.out.println(driver.getPageSource());
		
		//switching the control from frame to webPage
		driver.switchTo().defaultContent();
		
		System.out.println(driver.getTitle());
				
	}
}
