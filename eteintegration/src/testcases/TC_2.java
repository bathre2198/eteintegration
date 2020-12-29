package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_2 {

	@Test
	public void testcase01() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("google");
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
	
		


	

}
