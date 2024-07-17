package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Empty_browser {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     //get
     driver.get("http://172.16.15.42:8002/candidate/otr");
     Thread.sleep(3000);
     //getcurrenturl
     String expectedurl="http://172.16.15.42:8002/candidate/otr";
     
     
     String actualurl = driver.getCurrentUrl();
     Thread.sleep(3000);
     
     if(actualurl.contains(expectedurl))
     {
    	 System.out.println("pass");
     }
     else
     
     {
    	 System.out.println("fail");
    	 
     }
     
     //getpagesource
     String action = driver.getPageSource();
     Thread.sleep(3000);
     System.out.println(action);
     //gettitle
     String action2 = driver.getTitle();
     Thread.sleep(3000);
     System.out.println(action2);
     Thread.sleep(3000);
     driver.manage().window().maximize();
     driver.navigate().refresh();
     	 
     

}
}
