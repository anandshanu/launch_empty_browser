package WebDriver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class To_launch_emptybrowser {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver;
    driver = new EdgeDriver();
    driver.get("http://172.16.15.42:8002/candidate/otr");
    
    /*driver = new FirefoxDriver();
    driver.get("http://172.16.15.42:8002/candidate/otr");
   
    driver = new ChromeDriver();
    driver.get("http://172.16.15.42:8002/candidate/otr");*/
    
	}

}
