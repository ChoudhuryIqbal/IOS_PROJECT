package MavenAppium.com.maven_appium;
import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends Base {
	
	public static void main(String [] args) throws MalformedURLException {
		
		IOSDriver <IOSElement> driver=capability();
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Text Entry\"]").click();
		driver.findElementByClassName("_highlighter-box_lf61n_125 _inspected-element-box_lf61n_131").sendKeys("Hello");
		driver.findElementByAccessibilityId("OK").click();
	
	
	}

}
