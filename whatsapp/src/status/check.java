package status;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class check {
	@Test

	public void Tc() throws InterruptedException, IOException  {
		// TODO Auto-generated method stub
		int diff_second=0,diff_minute=0,diff_hour=0,i=0,c3=0,d=0,hour1=0,minute1=0,second1=0;String c;
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://web.whatsapp.com/");
Thread.sleep(50000);
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/label/div/div[2]")).sendKeys("gadhi");
	Thread.sleep(5000);
while(i==0)
{
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]")).click();
	try
	{
		
	
c=driver.findElement(By.xpath("//*[@id=\"main\"]/header/div[2]/div[2]/span")).getText();
if(c.equals("online")&&c3==0&&d==0)
{
		System.out.print(c);
	Calendar c1=Calendar.getInstance();
	 hour1=c1.get(Calendar.HOUR);
	 minute1=c1.get(Calendar.MINUTE);
	 second1=c1.get(Calendar.SECOND);
System.out.print(hour1+"h");
System.out.print(minute1+"m");
System.out.print(second1+"s");
FileWriter fw=new FileWriter("D:\\yogesh.txt");
System.out.println();
c3=1;
d=1;

}	 }
	catch(Throwable e)
	{
	if(c3==1&&d==1)
	{
		Calendar c1=Calendar.getInstance();
		int hour2=c1.get(Calendar.HOUR);
		int minute2=c1.get(Calendar.MINUTE);
		int second2=c1.get(Calendar.SECOND);
		
		System.out.print("offline");
	System.out.print(c1.get(Calendar.HOUR)+"h");
	System.out.print(c1.get(Calendar.MINUTE)+"m");
	System.out.print(c1.get(Calendar.SECOND)+"s");
	 if(second2 > second1) {
	        diff_second=second2-second1;
	 }
	       else
	    	   diff_second = second1 - second2;
	
	   if(minute2 > minute1) {
	    diff_minute=minute2-minute1;
	   }
	   else
		   diff_minute=minute1-minute2;
	   diff_hour=hour2-hour1;
	   System.out.print("--------------------->>>>"+diff_hour+"h"+diff_minute+"m"+diff_second);
	System.out.println();
	c3=0;
	d=0;
	
	}
	}
	
	}
	}
}


