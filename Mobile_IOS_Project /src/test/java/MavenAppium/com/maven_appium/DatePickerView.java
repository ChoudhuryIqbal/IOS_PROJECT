package MavenAppium.com.maven_appium;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class DatePickerView extends Base{
	
public static void main(String [] args) throws MalformedURLException {
		IOSDriver <IOSElement> driver=capability();
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementsByClassName("XCUIElementTypePickerWheel").get(1).sendKeys("10");;
	}
}
 