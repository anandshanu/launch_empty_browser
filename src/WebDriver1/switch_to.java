package WebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class switch_to {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new EdgeDriver();
	    driver.get("http://172.16.15.49:8002/candidate/otr");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);	
	    driver.findElement(By.xpath("//input[@id='candidate_name']")).sendKeys("dileep");
	    Thread.sleep(2000);
	   String parent = driver.getWindowHandle();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[text()='Login'][1]")).click();
	   Thread.sleep(2000);
	   Set<String> wind = driver.getWindowHandles();
	   for(String id :wind)
	   {
		   driver.switchTo().window(id);
		   Thread.sleep(2000);
		   if(!id.equals(parent))
		   {
			   String parent1 = driver.getCurrentUrl();
			   System.out.println(parent1);
		   }
	   }
	   
	   
	   
	    
	    
	}

}
