package Somteeautomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
//import java.io.File;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//import io.appium.java_client.service.local.AppiumServiceBuilder;

public class browserBaseTest {
	
	public AndroidDriver driver;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	
	{
		//AndriodDriver, IOSDriver
				//Appium code -> Appium Server -> Mobile
				
				//AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS( new File ("C:\\Users\\sanisiuba\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				//		.withIPAddress("127.0.0.1").usingPort(4723).build();
					//	service.start();
				
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("SomteeEmulator");
		options.setChromedriverExecutable("C:\\Users\\sanisiuba\\eclipse-workspace\\Apium\\src\\test\\java\\resources\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");

		
		//@SuppressWarnings("unused")
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
		
	public void scrollToEndAction() {
		boolean canScrollMore; 
		do
			{canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
			}while(canScrollMore);
		}
	
	public void swipeAction(WebElement focusTrue) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of
				("elementId",((RemoteWebElement)focusTrue).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
		
	}
	
	public void dragDrop(WebElement source)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 835,
			    "endY", 734
			));
	}
	public void StarterAssignment() {
		// getting the element app and click
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		// getting the element alert Dialogs and click
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	}
	
	public Double amountFormatted(String amount) {
	Double price= Double.parseDouble(amount.substring(1));
	return price;
	}
	
	
	
	@AfterClass
	public void TearDown()
	{
				driver.quit();
				//service.stop();
	}
}
