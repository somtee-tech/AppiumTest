package Somteeautomation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eCommerce_tc_2 extends baseTest{

	@Test
	public void filligForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Chuma");
		driver.hideKeyboard();
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true))" +
		         ".scrollIntoView(new UiSelector().text(\"Benin\"))"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Benin']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();

		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'])[1]")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		List<WebElement> productAmount = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int count = productAmount.size();
		Double sum = 0.0;
		for (int i=0; i<count; i++) {
			String amountString = productAmount.get(i).getText();
			Double price= amountFormatted(amountString);
			sum = sum + price;
		}
		String checkAmount = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		Double displayFormattedSum = amountFormatted(checkAmount);
		Assert.assertEquals(sum, displayFormattedSum);
		WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		longPressAction(ele);
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(3000);

		//Hybrid --google--
		Set<String> contexts = driver.getContextHandles();
		//Advanced for loop
		for(String contextName :contexts)
		{
			System.out.println(contextName);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore"); //Chrome driver
		driver.findElement(By.id("input")).sendKeys("Rahul Shetty Academy");
		driver.findElement(By.id("input")).sendKeys("Keys.ENTER");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		//String checkOut = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		//Assert.assertEquals(checkOut, "Jordan Lift Off");


		
	}
}
