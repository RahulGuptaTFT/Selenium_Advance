 package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 public class Slider {

     public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
         driver.get("https://jqueryui.com/slider/");

         // switch to frame
         driver.switchTo().frame(0);

         // Element-path store in web-element variable
         WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

         // Actions class object creation
         Actions act = new Actions(driver);

         // For slider
         act.clickAndHold(slider).dragAndDropBy(slider,400,0).release().build().perform();

         Thread.sleep(3000);
         driver.quit();
     }
 }
