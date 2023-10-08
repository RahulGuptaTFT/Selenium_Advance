 package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 public class DragAndDrop {

     public static void main(String[] args) throws InterruptedException {

         WebDriver driver = new ChromeDriver();
         driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

         // Element path store in web-element variable
         WebElement stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
         WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));

         // Actions class object creation
         Actions act = new Actions(driver);

         // For Drag and Drop
         act.dragAndDrop(stockholm,italy).build().perform();


         /* Another way
         =>>  act.clickAndHold(stockholm).moveToElement(italy).release().build().perform();
         */
         Thread.sleep(3000);
         driver.quit();
     }
 }
