package FE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fbLOgin {
    WebDriver driver;
    public fbLOgin(WebDriver driver){
        this.driver = driver;
    }

    public void firstName(String FN){
        driver.findElement(By.id("email")).sendKeys(FN);
    }
    public void lastName(String LN){
        driver.findElement(By.id("pass")).sendKeys(LN);
    }
}
