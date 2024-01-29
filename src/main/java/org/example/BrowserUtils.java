package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserUtils extends ReadJson {
    AndroidDriver  <WebElement> driver;
    public static String[] returnedarray = ReadJson.readJsonData();  //This is just to call the function to read the files.
    // This is not gonna be used anywhere but the json data will be used




    @Test
    public void setup(String name) throws MalformedURLException {
        String appname = "G:\\Abul Hossain Chowdhury\\Projects\\Savoy_App_Test\\src\\APK\\"+name;
        DesiredCapabilities DC = new DesiredCapabilities();
        DC.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        DC.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a Emulator");
        DC.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        DC.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        DC.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        DC.setCapability(MobileCapabilityType.APP, appname);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver <WebElement> (url,DC);
    }

    public void Teardown(){
        driver.closeApp();
    }
}
