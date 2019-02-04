package MavenAppium.com.maven_appium;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceSafariIOS {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = DesiredCapabilities.iphone();
		cap.setCapability("appiumVersion", "1.9.1");
		cap.setCapability("deviceName","iPhone 6 Simulator");
		cap.setCapability("deviceOreintation","portrait");
		cap.setCapability("platformVersion","12.0");
		cap.setCapability("platformName", "iOS");
		cap.setCapability("browserName", "Safari");
		IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://iqbalch:4f8c1ba4-3de9-4ed6-8323-9ef75a01a18b@ondemand.saucelabs.com:80/wd/hub"),cap);
 
	}

}
