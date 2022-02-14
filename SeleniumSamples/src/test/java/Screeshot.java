import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//launch the browser
		driver.get("https://www.facebook.com/");
		
		//Takes the Screenshot.
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		
		///storing the screenshot
		FileUtils.copyFile(screenshot, new File("C:\\Users\\sahas\\Desktop\\Sahas\\Screenshots\\ssTake.png"));
		

	}

}
