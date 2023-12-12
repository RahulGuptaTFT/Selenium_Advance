package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 1) = FindElement (Javascript) , Highlight (Javascript)
        //js.executeScript("document.getElementById('email').setAttribute('style','border:4px solid red; background:yellow')");

        // seprate
        //js.executeScript("document.getElementById('email').style.border='4px solid red'");
        //js.executeScript("document.getElementById('email').style.background='yellow'");

//        --------------------------------------------------------------------------------------------------------------

        // 2) = FindElement (WebDriver) , Highlight (Javascript)
        WebElement ele = driver.findElement(By.id("email"));
        js.executeScript("arguments[0].setAttribute('style','border:4px solid red; background:yellow')",ele);
    }
}
