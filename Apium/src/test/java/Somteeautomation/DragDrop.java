package Somteeautomation;

import java.net.MalformedURLException;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DragDrop extends baseTest{

@Test
	
	public void LongPressGesture () throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		dragDrop(source);
		Thread.sleep(2000);
		String check = driver.findElement(By.id("io.appium.andriod.apis:id/drag_result_text")).getText();
		Assert.assertEquals(check, "Dropped!");
	}
}

