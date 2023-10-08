package HandleWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class HW_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        driver.findElement(By.xpath("//*[@href='http://www.google.com']")).click();

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows.size());

        ArrayList<String>tabs = new ArrayList<>();
        for (String child : allWindows){
            tabs.add(child);
        }
        if(!parentWindow.equalsIgnoreCase(tabs.get(1))) {
            driver.switchTo().window(tabs.get(1));
            driver.findElement(By.name("q")).sendKeys("Rahul"+ Keys.ENTER);
            Thread.sleep(3000);
            driver.close();
        }
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        driver.close();
    }
}
