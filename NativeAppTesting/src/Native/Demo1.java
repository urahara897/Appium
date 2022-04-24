package Native;

import java.net.MalformedURLException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Demo1 extends capabilities {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement link = driver.findElementByAndroidUIAutomator("clickable(true)");
		Dimension xyz = link.getSize();
		System.out.println(xyz);
		//to tap on any element store it in a webelement/androidelement
		WebElement expandlist = driver.findElementByAccessibilityId("Expandable Lists");
		//to tap
		TouchAction ta = new TouchAction(driver);
		//can perform tap and long press with touchactions
		//point action for x and y coordinates
		//to tap on any element
		ta.tap(tapOptions().withElement(element(expandlist))).perform();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		Thread.sleep(3000);
		WebElement lp = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElements(By.className("android.widget.TextView")).get(1).getText());
		
		
		
		
	}
	
}
