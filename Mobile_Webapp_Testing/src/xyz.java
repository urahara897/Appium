import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import net.jcip.annotations.Immutable;

public class xyz extends capabilities {

     public static void main(String[] args) throws MalformedURLException, InterruptedException {
    	 
    	 AndroidDriver<AndroidElement> driver = capability();
    	 System.out.println("Will open browser in emulator browser");
    	 driver.get("http://www.google.com");
    	 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("moolya");
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("mobile:performEditorAction",ImmutableMap.of("action","search"));
    	 //driver.findElement(By.xpath("//sticky-header/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
    	 List<AndroidElement> links = driver.findElements(By.tagName("a"));
    	 Thread.sleep(3000);
    	 WebElement wb = driver.findElement(By.xpath("//[contains(text(),'Moolya Testing (@moolyatesting) / Twitter')]"));
    	 Thread.sleep(3000);
    	 js.executeScript("arguments[0],scrollIntoView(true);",wb);
    	 Thread.sleep(3000);
    	 wb.click();
    	 //js.executeScript("document.getElementsbyClassName('q8U8x MBeuO ynAwRc oewGkc LeUQr').scrollIntoView()");
    	 //driver.findElement(By.xpath("//*[@class='cz3goc BmP5tf']")).click();
    	 
     }
	
}
