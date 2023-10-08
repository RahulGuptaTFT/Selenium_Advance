 package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 public class Resizable {

     public static void main(String[] args) throws InterruptedException {
         // Set the path to your ChromeDriver executable

         WebDriver driver = new ChromeDriver();
         driver.get("https://jqueryui.com/resizable/");
         driver.manage().window().maximize();
         Thread.sleep(2000);

         // Switch to the frame containing the resizable element
         driver.switchTo().frame(0);

         // Locate the resizable element
         WebElement resizeElement = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));

         // Initialize Actions
         Actions actions = new Actions(driver);

         // Perform the resize action
         int xOffset = resizeElement.getSize().getWidth();
         System.out.println(xOffset);
         int yOffset = resizeElement.getSize().getHeight();
         System.out.println(yOffset);
         // Click and hold the resize handle and move it to resize
         actions.clickAndHold(resizeElement)
                 .dragAndDropBy(resizeElement,xOffset, yOffset) // Adjust the values as needed for resizing
                 .release()
                 .build()
                 .perform();

         Thread.sleep(3000);

         // Close the browser
         driver.quit();
     }
 }

