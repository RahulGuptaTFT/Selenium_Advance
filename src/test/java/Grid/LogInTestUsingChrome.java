package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LogInTestUsingChrome {

   static WebDriver driver;

    @BeforeMethod
    void setup() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");

        driver = new RemoteWebDriver(new URL("http://localhost:4444"),cap);
    }
    @Test
    public void test() {
          driver.get("https://www.google.com");
          driver.findElement(By.name("q")).sendKeys("Meaning of Rahul");
          driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
    }
    @AfterMethod
    public void teardown() throws InterruptedException {
            Thread.sleep(3000);
            driver.close();
    }
}









