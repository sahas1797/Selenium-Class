import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(3000L);
		
		//changing the control from webpage to alert
		Alert simplealert = driver.switchTo().alert();
		
		System.out.println(simplealert.getText());
		
		//sendign alert to prompt alert
		simplealert.sendKeys("data is sent to alert");

		Thread.sleep(3000L);
		
		//accepting alert after sending some data 
		simplealert.accept();
		
	}

}
