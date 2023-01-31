package Somteeautomation;

import java.net.MalformedURLException;
//import java.util.List;


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends baseTest{

@Test
	
	public void LongPressGesture () throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//where to scrollis known prior
		/* driver.findElement(AppiumBy.androidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
        ".scrollIntoView(new UiSelector().text(\"Nike Blazer Mid '77\"))"));*/
		//no prior idea
		
		scrollToEndAction();
	}
}

