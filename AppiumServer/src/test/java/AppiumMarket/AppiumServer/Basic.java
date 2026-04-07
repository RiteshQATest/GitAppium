package AppiumMarket.AppiumServer;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Basic {
	@Test
public void AppiumStart() throws MalformedURLException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("RitzDevice");
	options.setApp("C://Users//rites//eclipse-appiumworkspace//AppiumServer//src//test//java//resources//ApiDemos-debug.apk");
	AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
	driver.quit();
	
}
}
