package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Empty_Browser {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
    driver = new EdgeDriver();
    driver.get("http://172.16.15.49:8002/candidate/otr");
    Thread.sleep(2000);
    driver = new ChromeDriver();
    driver.get("http://172.16.15.49:8002/candidate/otr");
    Thread.sleep(2000);
    driver = new FirefoxDriver();
    driver.get("http://172.16.15.49:8002/candidate/otr");
    
    
    
     
    
    
     
     
	}

}
