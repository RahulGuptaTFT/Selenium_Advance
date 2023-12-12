package JavaScriptExecutor;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsClick {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //JavaScrpt Executor Interface
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Alert
//        js.executeScript("alert('Hi Rahul')");

        // SendKeys using Js
        js.executeScript("document.getElementById('APjFqb').value='rahul'");


        String sText =  js.executeScript("return document.title;").toString();
		System.out.println(sText);

    }
}
