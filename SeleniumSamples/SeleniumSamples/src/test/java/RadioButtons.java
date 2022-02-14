import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://materializecss.com/radio-buttons.html");
		
		Thread.sleep(2000);
		
		//locating email box
		WebElement we =driver.findElement(By.xpath("//span[text()='Green']"));
		
		we.click();
		
		boolean b= we.isEnabled();
		
		System.out.print(b);	
	}

}



