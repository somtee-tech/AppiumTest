package Somteeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class SwipeDemo extends baseTest{

@Test
	
	public void LongSwipeGesture () throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement focusTrue = driver.findElement(By.xpath("//android.widget.ImageView[@index='0']"));
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).getAttribute("focusable"), "true");
		
		//Swipe code
		swipeAction(focusTrue);
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[@index='0']")).getAttribute("focusable"), "false");
		Thread.sleep(2000);
	}

	
}

