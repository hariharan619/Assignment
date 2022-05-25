package SelExercise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelExercise1 {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
				driver.get("https://sterlingsoftware.peopleworks.ind.in/");
				 driver.manage().window().maximize();
				String a ="Sterling\\2111";
		Thread.sleep(3000);
		driver.findElement(By.id("UserName")).sendKeys(a);
		Thread.sleep(3000);
		String b ="Amaterasu619!@#";
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("Password")).click();
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys(b);
		
		driver.findElement(By.xpath("//input[@id='btnlogin']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//a[text()='My Self']"));
		Thread.sleep(6000);		
		Actions action  = new Actions(driver);
		
		action.moveToElement(ele);
		Thread.sleep(3000);		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='My Leave']"));
		
		action.moveToElement(ele2);
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Apply/Cancel Leave']"));
		action.moveToElement(ele3);
		action.click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Apply Leave']")).click();
		
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  /*Select regular = new Select(driver.findElement(By.xpath("//select[@name='AttependanceTy']")));
	  regular.selectByIndex(2);


	  Select time = new Select(driver.findElement(By.id("Duration")));
	  time.selectByIndex(1);*/
	  
String primaryWindowHandle = driver.getWindowHandle();
        
        driver.switchTo().window(primaryWindowHandle);
		WebElement ele4 = driver.findElement(By.xpath("//select[@name='AttependanceTy']"));
	
		action.click(ele4).sendKeys( Keys.ARROW_DOWN).perform();
		
		
	 /* WebElement ele4 = driver.findElement(By.className("ui-multiselect ui-widget ui-state-default ui-corner-all"));
	  action.moveToElement(ele4).click();
	  
	 driver.findElement(By.xpath("//select[@name='AttependanceTy']/option[@value='1']")).click();
	 */
	  driver.findElement(By.id("Reason")).sendKeys("work from office");
	  
	  driver.findElement(By.xpath("//span[text()='Submit']")).click();
	  
	}

}


