package SelExercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ReadExcel.ReadExceldata;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelEx2{
    @Test(dataProvider = "getData") 
	public void runSelEx2(String uname, String password,String reason) throws InterruptedException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub

    	 WebDriverManager.chromedriver().setup();
   		   		
      	ChromeDriver driver = new ChromeDriver();
      				driver.get("https://sterlingsoftware.peopleworks.ind.in/");
      				 driver.manage().window().maximize();
				//String a ="Sterling\\2111";
		Thread.sleep(3000);
		
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./proterties/config.properties")));
		
		
		driver.findElement(By.id(prop.getProperty("PWloginpage.UserName.ID"))).sendKeys(uname);
		Thread.sleep(3000);
		//String b ="Amaterasu619!@#";
		
		Thread.sleep(3000);
		
		driver.findElement(By.id(prop.getProperty("PWloginpage.Password.ID"))).click();
		driver.findElement(By.id(prop.getProperty("PWloginpage.Password.ID"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.id(prop.getProperty("PWloginpage.Password.ID"))).sendKeys(password);
        driver.findElement(By.xpath(prop.getProperty("PWloginpage.Submit.xpath"))).click();
        Thread.sleep(6000); 
      
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath(prop.getProperty("PWhomepage.MYself.xpath")));
        Thread.sleep(1000); 
        ele.click();
        Thread.sleep(3000); 
        
        Thread.sleep(7000); 
        try {
        driver.switchTo().alert().accept();
        }catch(Exception e) {
             System.out.println("No Alert"); 
        }
        
       // Actions action  = new Actions(driver);
        WebElement ele2 = driver.findElement(By.xpath(prop.getProperty("PWhomepage.MyAttendance.xpath")));
        ele2.click();
       
        //action.moveToElement(ele2);
        WebElement ele3 = driver.findElement(By.xpath(prop.getProperty("PWhomepage.MYself.MyAttendance.xpath")));
       /* action.moveToElement(ele3);
        action.click().build().perform();*/
        ele3.click();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.xpath"))).click();
        
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*Select regular = new Select(driver.findElement(By.xpath("//select[@name='AttependanceTy']")));
        regular.selectByIndex(2);


        Select time = new Select(driver.findElement(By.id("Duration")));
        time.selectByIndex(1);*/
        String primaryWindowHandle = driver.getWindowHandle();
        
        driver.switchTo().window(primaryWindowHandle);
        
        driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.select1.xpath"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.select1.onduty.xpath"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.select2.xpath"))).click();
        driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.select2.time.xpath"))).click();
        Thread.sleep(3000);
         driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.date1.xpath"))).click();
       
          driver.findElement(By.xpath("//a[text()='19']")).click();
          driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.date2.xpath"))).click();
          driver.findElement(By.xpath("//a[text()='19']")).click();
          driver.findElement(By.id(prop.getProperty("PWMyattendance.applyforRegularization.duration1.ID"))).sendKeys("09:00");
          driver.findElement(By.id(prop.getProperty("PWMyattendance.applyforRegularization.duration2.ID"))).sendKeys("18:00");
          driver.findElement(By.id(prop.getProperty("PWMyattendance.applyforRegularization.reason.ID"))).sendKeys(reason);
          
          driver.findElement(By.xpath(prop.getProperty("PWMyattendance.applyforRegularization.Submit.xpath"))).click();
          

	}
    @DataProvider
     	public Object[][]getData() throws IOException {
    		 
    		return ReadExceldata.getExceldata();

    }

}
