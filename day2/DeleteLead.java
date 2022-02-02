package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		driver.findElement(By.linkText("Phone")).click();
		
		driver.findElement(By.name("phoneNumber")).sendKeys("9444206841");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	String leadId= driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/a")).getText();
		System.out.println(leadId);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//Button[@class='x-btn-text']")).click();
		driver.close();
		
		
	}

}
