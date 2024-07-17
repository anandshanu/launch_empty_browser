package WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class close_quit {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new EdgeDriver();
    driver.get("http://172.16.15.49:8002");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//p[text()='Login']")).click();
    Thread.sleep(2000);
    driver.close();
    driver.quit();
	}

}
