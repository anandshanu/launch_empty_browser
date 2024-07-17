package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_title {

	public static void main(String[] args) throws InterruptedException {
    String expectedtitle= "One Time Registration (OTR)";
    WebDriver driver = new EdgeDriver();
    
    driver.get("http://172.16.15.49:8002/candidate/otr");
    driver.manage().window().maximize();
   
    Thread.sleep(2000);
   String actualtitle = driver.getTitle();
   System.out.println(actualtitle);
   if(actualtitle.contains(expectedtitle))
   {
	   System.out.println("pass");
   }
   else
   {
	   System.out.println("fail");
   }
	}

}
