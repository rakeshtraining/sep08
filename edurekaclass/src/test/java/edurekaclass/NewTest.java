package edurekaclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  
	
	
	@Test
  public void addressbook() throws InterruptedException {
	  ChromeDriver driver = new ChromeDriver();
      driver.get("http://localhost:8090/addressbook/");
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("sept08devops");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("edureka");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("123123123");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("edureka@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("09/08/2019,");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
	  Thread.sleep(5000);
	  driver.close();
	  		
	  
	  
	  
	  
  }
}
