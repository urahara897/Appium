package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class Demo4 extends capabilities{

public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver = capability();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		Thread.sleep(3000);
		/*driver.findElementByAccessibilityId("Date Widgets").click();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("2. Inline").click();
		Thread.sleep(3000);
		driver.findElementByAccessibilityId("9").click();
		WebElement btn1 = driver.findElementByAccessibilityId("15");
		WebElement btn2 = driver.findElementByAccessibilityId("45");
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();*/
		driver.findElementByAccessibilityId("Drag and Drop").click();
		Thread.sleep(3000);
		WebElement btn1 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement btn2 = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		Thread.sleep(3000);
		TouchAction t = new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(3))).moveTo(element(btn2)).release().perform();
}
}