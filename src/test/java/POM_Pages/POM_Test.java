package POM_Pages;

import POM_Pages.Dashboard;
import POM_Pages.Homepage;
import POM_Pages.Loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.demoqa.com/books");

      // object creation of homepage class
        Homepage home = new Homepage(driver);

      // object creation of loginpage class
        Loginpage login = new Loginpage(driver);

      // object creation of dashboard class
        Dashboard dashboard = new Dashboard(driver);

        // click on login button on homepage
        home.clickLogin();

        //Enter username & password
        login.enterUsername("gunjankaushik");
        login.enterPassword("Password@123");

        //Click on login button
        login.clickLogin();
        Thread.sleep(3000);

        //Capture the page heading and print on console
        System.out.println("The page heading is --- " +dashboard.getHeading());

        //Click on Logout button
        dashboard.clickLogout();

        //Close browser instance
        driver.quit();
    }
}
