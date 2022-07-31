package yt_videos_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Videos_basetest {
	
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	
	public void launch_app() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/");
		
	}
	
	
	
	
	@AfterMethod
	
	public void closeapp() {
		driver.quit();
		
	}
	

}
