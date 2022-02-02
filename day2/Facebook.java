package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
			driver.findElement(By.xpath("//div[@class='_5dbb']//input[@name='firstname']")).sendKeys("hariharanbalaji");
		driver.findElement(By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input")).sendKeys("thiru");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9444206841");
         driver.findElement(By.xpath("//div[@id='password_field']//input[@name='reg_passwd__']")).sendKeys("indra619");
         WebElement dDown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
         Select select = new Select(dDown);
         select.selectByVisibleText("20");
         
         WebElement pDown= driver.findElement(By.xpath("//select[@name='birthday_month']"));
         Select sel = new Select(pDown);
         
         sel.selectByValue("11");
         
         WebElement kDown= driver.findElement(By.xpath("//select[@name='birthday_year']"));
         Select sele = new Select(kDown);
         int size = select.getOptions().size();
         sele.selectByIndex(size-1);
         
         driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='2']")).click();
         driver.findElement(By.xpath("//div[@class='_1lch']/button[@name='websubmit']")).click();
	}

}
