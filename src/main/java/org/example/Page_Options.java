package org.example;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class Page_Options extends BrowserUtils{
    public void Login(String username, String password) throws MalformedURLException, InterruptedException {
        //click the username and input in the field
        MobileElement un = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        un.click();
        driver.getKeyboard().sendKeys(username);

        Thread.sleep(2000);

        //click the password and input in the field
        MobileElement pw = (MobileElement) driver.       findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
        pw.click();
        driver.getKeyboard().sendKeys(password);
    }
}
