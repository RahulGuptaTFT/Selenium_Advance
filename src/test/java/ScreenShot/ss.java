package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ss {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://toolsqa.com/");
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:/Users/Rahul Gupta/IdeaProjects/SeleniumAdvance/src/ScreenShots/img1.png"));
        driver.close();

    }
}
