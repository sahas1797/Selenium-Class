import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FIleUpload {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(3000L);
		
		//uploading file by giving the local path from PC
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\sahas\\Desktop\\Sahas\\Book1.xlsx");
		

	}

}
