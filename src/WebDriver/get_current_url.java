package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class get_current_url {

	public static void main(String[] args) throws InterruptedException {
	
	     WebDriver driver = new EdgeDriver();
	     String expectedurl = "http://172.16.15.42:8002/candidate/otr";
	     driver.get("http://172.16.15.42:8002/candidate/otr");
	     Thread.sleep(2000);
	     driver.manage().window().maximize();
	     //driver = new ChromeDriver();
	     Thread.sleep(2000);
	     //driver.navigate().to("http://172.16.15.42:8002/candidate/otr");
	     WebElement candidatename = driver.findElement(By.xpath("//input [@id ='candidate_name']"));
	     Thread.sleep(2000);
	     candidatename .sendKeys("dileep");
	     //Thread.sleep(2000);
	     driver.findElement(By.xpath("//div[@class='react-select__indicator react-select__dropdown-indicator css-1xc3v61-indicatorContainer'][1]")).click();
	     //Thread.sleep(2000);
	    WebElement action1 = driver.findElement(By.xpath("//div[text()='Yes']"));
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);
	    
	    Thread.sleep(2000);
	    action.moveToElement(action1).perform();
	    Thread.sleep(2000);
	    action1.click();
	    
	    Thread.sleep(2000);
	    action.click();
	    WebElement changename = driver.findElement(By.xpath("//input[@id='changed_name']"));
	    Thread.sleep(2000);
	    changename.sendKeys("dileep");
	    Thread.sleep(2000);
	    if ( candidatename.equals(changename))
	    {
	    	System.out.println("This value can't be same as [Candidate's Name (as per Class X)]");
	    	
	    }
	    Thread.sleep(2000);
	    changename.clear();
	    Thread.sleep(2000);
	    
	    changename.sendKeys("shanu");
	    
	    WebElement acti=driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='CalendarIcon'][1]"));
		  Thread.sleep(2000);
		  
		  action.moveToElement(acti).click().perform();
		  driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='ArrowDropDownIcon'][1]")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[text()='1993']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@data-timestamp='736799400000']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@type='mobile']")).sendKeys("6969234566");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedSuccess MuiButton-sizeSmall MuiButton-containedSizeSmall css-vcy73i']//strong[contains(text(),'Send OTP')]")).click();
		  WebElement mobile=driver.findElement(By.xpath("//div[@class='mb-1 my-input-mobile']//small//div[1]"));
		  driver.findElement(By.xpath("//input[@id='verifyOtpMobile']"));
		  
		  
		  
	    
	    
	     
	   
	    	
	     
	     
	     
	}

}
