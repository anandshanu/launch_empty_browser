package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class window_handle_handles {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.get("https://upsc.gov.in");
    driver.manage().window().maximize();
    Thread.sleep(2000);
   String parentwin = driver.getWindowHandle();
   driver.findElement(By.xpath("//a[text()='One Time Registration (OTR) for Examinations']")).click();
   Thread.sleep(2000);
 Set<String> allwin = driver.getWindowHandles();
 for(String id:allwin)
 {
	 driver.switchTo().window(id);
	 if(!id.equals(parentwin))
		
	 {
		String childtitle= driver.getTitle();
		System.out.println(childtitle);
	 }
	 
 }
	}

}
