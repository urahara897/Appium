import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import net.jcip.annotations.Immutable;

public class abc extends capabilities{
	
 public static void main(String[] args) throws MalformedURLException, InterruptedException {
    	 
    	 AndroidDriver<AndroidElement> driver = capability();
    	 driver.get("http://www.amazon.com");
    	 driver.findElement(By.xpath("//*[@class='nav-input nav-progressive-attribute']")).sendKeys("cheese");
 		 Actions act = new Actions(driver);
 		 act.sendKeys(Keys.ENTER).perform();
 		 Thread.sleep(9000);
 		WebElement link = driver.findElement(By.partialLinkText("The Best of Europe Cheese"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].scrollIntoView(true);",link);
		 Thread.sleep(3000);
		 WebElement link1 = driver.findElement(By.partialLinkText("Hillshire Farm Holiday Classic"));
		 js.executeScript("arguments[0].click();", link1);
		Thread.sleep(3000);
		 //link.click();
    	 //JavascriptExecutor js = (JavascriptExecutor)driver;
    	 //Actions act = new Actions(driver);
 		 //act.sendKeys(Keys.ENTER).perform();
    	 //js.executeScript("mobile:performEditorAction",ImmutableMap.of("action","search"));
    	 //Thread.sleep(3000);
    	 //WebElement wb = driver.findElement(By.xpath("//[contains(text(),'ASUS L410 MA-DB04 Ultra Thin Laptop']"));
    	 //Thread.sleep(3000);
    	 //js.executeScript("arguments[0],scrollIntoView(true);",wb);
    	 //Thread.sleep(3000);
    	 //wb.click();

}
}
