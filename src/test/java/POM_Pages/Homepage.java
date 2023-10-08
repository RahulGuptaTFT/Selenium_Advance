package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created
    public Homepage(WebDriver driver) {
        this.driver=driver;
    }

    //Locator for login button
    By LoginBtn = By.id("login");

    //Method to click login button
    public void clickLogin() {
        driver.findElement(LoginBtn).click();
    }

//    public static void main(String[] args) {
//        WebDriver driver1 = new ChromeDriver();
//        Homepage h = new Homepage(driver1);
//
//    }
}

