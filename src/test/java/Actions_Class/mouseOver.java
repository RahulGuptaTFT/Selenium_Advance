package Actions_Class;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/guide/selenium-actions-class");

        // Element path store in web-element variable
        WebElement products = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
        WebElement live = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[2]/div[1]"));

        // Actions class object creation
        Actions act = new Actions(driver);

        // For mouseOver
        act.moveToElement(products).build().perform(); // mouse on products
        act.moveToElement(live).click().build().perform(); // mouse on live and then click

        /* you can write it single line
        ==>>  act.moveToElement(products).moveToElement(live).click().build().perform();
        */

        driver.quit();
    }
}
