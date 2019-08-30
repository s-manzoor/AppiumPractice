
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class IDSMobileNew {

/*    WebDriver driver;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        // capabilities.setCapability("BROWSER_NAME", "Android");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "32045597196911c1");
        capabilities.setCapability("version", "6.0.1");
        capabilities.setCapability("app", "D:\\Automation\\IDSG3Mobile-0.0.1-8.apk");
        capabilities.setCapability("appActivity", "com.idsastra.idsg3mobile.MainActivity");
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }*/

 //   public class LocalAndroidTest {

        private String accessKey = "eyJ4cC51Ijo3MzI4MjQzLCJ4cC5wIjo3MzI4MjQyLCJ4cC5tIjoiTVRVMk5qTTJPVGMyTWpFeU1BIiwiYWxnIjoiSFMyNTYifQ.eyJleHAiOjE4ODE3Mjk3NjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.qmoyhjfQc-JzFV_TydsXyKY83ZaRfOsibuPiN11AVGc";
        protected AndroidDriver<AndroidElement> driver = null;
        DesiredCapabilities dc = new DesiredCapabilities();

        @BeforeClass
        public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start Android Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability(MobileCapabilityType.UDID, "920123c2e80f64d1"); // Run test on a specific device
       // dc.setCapability(MobileCapabilityType.APP, "cloud:com.idsastra.idsg3mobile/com.idsastra.idsg3mobile.SplashActivity");
       // dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.idsastra.idsg3mobile");
       // dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.idsastra.idsg3mobile.SplashActivity");

            dc.setCapability(MobileCapabilityType.APP, "cloud:com.idsastra.idsg3mobile/.SplashActivity");
            dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.idsastra.idsg3mobile");
            dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");

//           dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
        //  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        //  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        driver = new AndroidDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
    }


    @Test
 public void MobileTests() throws InterruptedException {
        System.out.println("This is Test Method class");
       /* WebElement screen = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup"));
        WebElement first = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[1]"));
        WebElement second = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]"));
        WebElement third =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]"));*/
       Thread.sleep(5000);
       WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText"));
       WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"));
       WebElement login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView"));
       /*WebElement settingsBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
       Thread.sleep(8000);
       WebElement enableDebug = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[2]"));*/
       email.sendKeys("s.manzoor17@dev.csidealercloud.com");
       password.sendKeys("webdir123$");
   //   settingsBtn.click();
   //   enableDebug.click();
       login.click();


        System.out.println("This is end of Test Method");

 }

    @AfterClass
 public void quit(){
     //  driver.quit();
    }
}
