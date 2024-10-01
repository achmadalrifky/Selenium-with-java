package MobileTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestApp {

    @Test
    public void selendroid() throws MalformedURLException, InterruptedException {
        AppiumDriver appiumDriver;

        // Set desiredCapabilities to send appium server
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("uiautomationName", "UiAutomator2");
        desiredCapabilities.setCapability("deviceName", "RR8T30384JP");
        //desiredCapabilities.setCapability("deviceName", "192.168.100.4:5555"); connect device with USB
        desiredCapabilities.setCapability("appPackage", "io.selendroid.testapp");
        desiredCapabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");

        // Setup the appium server URL to connect mobile
        URL remoteURl = new URL("http://127.0.0.1:4723/wd/hub");

        appiumDriver = new AppiumDriver(remoteURl, desiredCapabilities);

        // locator elements
        //WebElement BtnCancel = appiumDriver.findElement(By.id("com.android.permissioncontroller:id/cancel_button"));
        //BtnCancel.click();

        WebElement BtnLanjut = appiumDriver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
        BtnLanjut.click();

        Thread.sleep(1000);

        WebElement BtnAlert = appiumDriver.findElement(By.id("android:id/button1"));
        BtnAlert.click();


        WebElement KolomS = appiumDriver.findElement(By.xpath("//android.widget.Button[@content-desc='waitingButtonTestCD']"));
        KolomS.click();

        Thread.sleep(20000);

        WebElement KolomUserName = appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText[1]"));
        KolomUserName.sendKeys("Test");







    }
}
