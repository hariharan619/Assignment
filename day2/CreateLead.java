package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("ramesh");
		driver.findElement(By.id("lastNameField")).sendKeys("babu");
		driver.findElement(By.name("firstNameLocal")).sendKeys("hari");
		driver.findElement(By.name("lastNameLocal")).sendKeys("balaji");
		driver.findElement(By.name("description")).sendKeys("im hariharabalaji");
		driver.findElement(By.name("departmentName")).sendKeys("im a commerce student");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hariharabalajit@gmail.com");

	

		WebElement stateProvisionDropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select selectProvision = new Select(stateProvisionDropdown);
		selectProvision.selectByValue("IN");

		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("im hariharablaji");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String titleName = driver.getTitle();
		System.out.println("Title : " + titleName);
		
	}

}
