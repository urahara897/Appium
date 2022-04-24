package Native;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demo3 extends capabilities{
	
public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//scroll till the element and then click on the element
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		//js for webapp not native and hybrid app
}
	

}
