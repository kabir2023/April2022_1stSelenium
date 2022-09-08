package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//SETUP SYSTEM PROPERTY
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kamra_0b9xx0w\\Downloads\\April_22-selenium\\1st_Selenium\\driver\\chromedriver.exe");
		//OBJECT OF CHROME DRIVER
		WebDriver driver = new ChromeDriver();
		//GO TO WEBSITE
		driver.get("https://www.selenium.dev/");
		//MAXIMIZE THR BROWSER 
		driver.manage().window().maximize();
		//PAUSE EXECUTION
		Thread.sleep(3000);
		//CLOSE BROWSER
		driver.close();
	}

}
