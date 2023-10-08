package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        driver.findElement(By.xpath("//*[@href='http://www.google.com']")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows.size());

        for (String child : allWindows){
            if (!parentWindow.equalsIgnoreCase(child)){
                driver.switchTo().window(child);
                driver.findElement(By.name("q")).sendKeys("Rahul");
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        Thread.sleep(3000);
        driver.close();
    }
}
