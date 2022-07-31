package yt_videos_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchpage {
	WebDriver driver;
	
	
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void searching_channel(String channel_name) throws InterruptedException {
		WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys(channel_name);
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Small Town Rider']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Slushy Offroad ')])[2]")).click();
		Thread.sleep(2000);
	}
	
	public void running_video() {
		while(true) {
		WebElement text = driver.findElement(By.xpath("(//a[@aria-disabled='false']//following-sibling::div//span)[3]"));
		String str = text.getText();
		System.out.println(str);
		WebElement fixtime = driver.findElement(By.xpath("(//a[@aria-disabled='false']//following-sibling::div//span)[5]"));
		String stri = fixtime.getText();
		System.out.println(stri);
		if(!str.equals(stri)) {
			System.out.println("hi");
			
			
		}else {
			System.out.println("hello");
		}
//		while(!str.equals(stri)) {
//			System.out.println("hi");
//			break;
//			WebElement text = driver.findElement(By.xpath("(//a[@aria-disabled='false']//following-sibling::div//span)[3]"));
//			String str = text.getText();
			
		}
	
	}
	
	

}
