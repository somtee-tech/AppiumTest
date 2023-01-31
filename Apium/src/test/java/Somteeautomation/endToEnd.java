package Somteeautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
//import org.openqa.selenium.DeviceRotation;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class endToEnd extends baseTest {
	
@Test
public void EndToEndAssignment () {
	//LANDSCAPE 
	//DeviceRotation landscape = new DeviceRotation(0, 0, 90);
	//driver.rotate(landscape);
	
	//App Package and App activity
	Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.app.AlertDialogSamples");
	driver.startActivity(activity);
	//StarterAssignment();
	// getting the element List dialogs and click
	driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
	// getting the header title and assign to a variable
	String headerTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
	// Assert that actual is equal expected
	Assert.assertEquals(headerTitle, "Header title");
	//get element and click
	driver.findElement(By.xpath("//android.widget.TextView[@text='Command two']")).click();
	// getting the header title and assign to a variable
	String popTitle = driver.findElement(By.id("android:id/message")).getText();
	// Assert that actual is equal expected
	Assert.assertEquals(popTitle, "You selected: 1 , Command two");
	
	//HOME
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	

	driver.findElement(AppiumBy.accessibilityId("Text Entry dialog")).click();
	String textTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(textTitle, "Text Entry dialog");
	//driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("Somtee");
	//driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("enagma@3!1");
	
	    //LANDSCAPE 
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		driver.rotate(landscape);
		
	driver.setClipboardText("Chuma");
	driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys(driver.getClipboardText());
	driver.setClipboardText("orangRoom");
	driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys(driver.getClipboardText());
	driver.findElement(By.id("android:id/button1")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	

	//driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
	//String radioTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
	// Assert that actual is equal expected
	//Assert.assertEquals(radioTitle, "Single choice list");
	//driver.findElement(By.xpath("//android.widget.CheckedTextView[@Text='Street view']")).isSelected();
	//driver.findElement(By.xpath("//android.widget.CheckedTextView[@Text='Street view']")).isSelected();
	//driver.findElement(By.id("android:id/button1")).click();


		
}

}
