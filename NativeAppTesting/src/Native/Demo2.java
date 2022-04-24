package Native;

import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo2 extends capabilities {
   
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capability();
		//to open notifications
		driver.openNotifications();
		driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
		
	}
	
}
