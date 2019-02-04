package MavenAppium.com.maven_appium;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe extends Base{
	
public static void main(String [] args) throws MalformedURLException {
		
		IOSDriver <IOSElement> driver=capability();
		new TouchAction(driver).press(PointOption.point(100, 596)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
		moveTo(PointOption.point(100, 75)).release().perform();
			
	}

}
 