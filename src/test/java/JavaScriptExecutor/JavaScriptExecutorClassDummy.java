package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class JavaScriptExecutorClassDummy {
    static WebDriver driver;

    @Test
    public static void javaScriptExeMethod() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://Google.com");

        // 1) = To use JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 2) = To print on console
         js.executeScript("console.log('hello world')");

        // 3) = Systax ==> js.executeScript("")

        // 4) = Print Title
         String str= js.executeScript("return document.title ").toString();
         System.out.println(str);

         // 5) = Send Text
         js.executeScript("document.getElementById('APjFqb').value='Random text here'");

         // 6) = Click
        WebElement btn= driver.findElement(By.xpath("//div[@class='lJ9FBc']/center/input[1]"));
        js.executeScript("arguments[0].click()",btn);
        // other way ==>
        // js.executeScript("window.setTimeout(()=>{arguments[0].click()},1000)",btn);

        // 7) = move to other page
         js.executeScript("window.setTimeout(()=>{document.location='https://www.facebook.com'},2000)");

         // 8) = Scroll the page
        //js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(9000);
        driver.quit();
    }
}
