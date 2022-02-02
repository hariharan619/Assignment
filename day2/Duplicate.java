package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicate {
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hariharabalajit@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
		//System.out.println(lead);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		if(driver.getTitle().contains("Duplicate Lead")){
		    //Pass
		    System.out.println("Page title contains duplicate lead ");
		}
		else {
		    //Fail
		    System.out.println("Page title doesn't contains not duplicate ");
		}
		driver.findElement(By.className("smallSubmit")).click();
		String leadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(leadName.equals(s)) {
			System.out.println("Lead is duplicated");
			
		}
		
	}

}
