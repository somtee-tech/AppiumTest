package Somteeautomation;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.appium.java_client.AppiumBy;

public class eCommerce_tc_1 extends baseTest{

	@Test
	public void filligForm() throws InterruptedException {
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Anisiuba Cynthia");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).ScrollIntoView(text(\"Argentina\"));")); 
		driver.findElement(By.xpath("//android.widget.TextView[@text='Algeria']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("(//andriod.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toastMessage, "Please enter your name");
		Thread.sleep(5000);


		
	}
}
