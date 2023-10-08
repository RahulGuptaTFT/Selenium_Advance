 package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseRightClick {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        // Element path store in web-element variable
        WebElement rightClcikMe = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        WebElement copy = driver.findElement(By.xpath("//body[1]/ul[1]/li[3]/span[1]"));

        // Actions class object creation
        Actions act = new Actions(driver);

        // For Mouse Right Click
        act.contextClick(rightClcikMe).build().perform();
        copy.click();

        // for switching from window to alert box
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(5000);


        driver.quit();
    }
}
