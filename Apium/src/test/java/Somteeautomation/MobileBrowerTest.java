package Somteeautomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MobileBrowerTest extends browserBaseTest {
	
	@Test
	
	public void browerTest() 
	{
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("input")).sendKeys("Rahul Shetty Academy");
		driver.findElement(By.id("input")).sendKeys("Keys.ENTER");
		
	}

}
