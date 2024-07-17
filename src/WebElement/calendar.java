package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new EdgeDriver();
	     driver.get("http://172.16.15.42:8002/candidate/otr");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     Actions action = new Actions(driver);
	     
	  WebElement acti=driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='CalendarIcon'][1]"));
	  Thread.sleep(2000);
	  action.moveToElement(acti).click().perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@data-timestamp='1210789800000']")).click();
	   
	   
	
	}

}
