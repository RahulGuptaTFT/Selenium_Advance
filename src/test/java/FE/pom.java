package FE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pom {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        fbLOgin a = new fbLOgin(driver);
        a.firstName("rahul");
        a.lastName("gupta");
    }
}
