package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created

    public Dashboard(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Locators for the page title and the logout button
    By heading = By.xpath("//div[@class=\"main-header\"]");
   // By logOutBtn = By.id("submit");
    
//     Other Way
    @FindBy(id = "submit")
    By logOutBtn;


    //Method to capture the page heading
    public String getHeading() {
        String head = driver.findElement(heading).getText();
        return head;
    }

    //Method to click on Logout button
    public void clickLogout() {
        driver.findElement((logOutBtn)).click();
    }
}
