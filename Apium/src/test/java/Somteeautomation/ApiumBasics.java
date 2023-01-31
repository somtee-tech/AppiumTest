package Somteeautomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ApiumBasics extends baseTest {
	
	@Test
	
	public void WifiSettingName () throws MalformedURLException
	{		
		//code to start server
		//AndriodDriver, IOSDriver
		//Appium code - > Appium Server -> Mobile
		//Actual Automation
		//Xpath, id, accessibilityId classname, andriodUIAutomator
		//format for Xpath
		//tagname[@attribute='value'] -> //tagname
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("Chizim's Wifi");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	
		
		
		
		
	}

}
