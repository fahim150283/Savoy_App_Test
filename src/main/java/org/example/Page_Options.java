package org.example;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.net.MalformedURLException;

public class Page_Options extends BrowserUtils{
    public static String xpath;
    public static String id;
    public void Login(String username, String password) throws MalformedURLException, InterruptedException {
        TouchActions touchaction = new TouchActions(driver);
        System.out.println(username+" - "+password);

        //click the username and input in the field
        xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";
        MobileElement un = (MobileElement) driver.findElementByXPath(xpath);
        touchaction.singleTap(un).perform();
        new Actions(driver).sendKeys(username).perform();

        Thread.sleep(2000);

        //click the password and input in the field
        MobileElement pw = (MobileElement) driver.       findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        touchaction.singleTap(pw).perform();
        new Actions(driver).sendKeys(password).perform();
    }
}
