package com.seleniumappium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/merveagarak/IdeaProjects/SeleniumDrivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        WebElement proceedBtn = driver.findElement(By.id("details-button"));
        proceedBtn.click();
        WebElement proceedLink = driver.findElement(By.id("proceed-link"));
        proceedLink.click();
        //if the element couldnt find
        //could be issue with Wrong Locator Details
        //Make sure the element is loaded --if it s not add thread
        //Elements could be a frame
        try {
            Thread.sleep(5*1000); //5saniye sayfanın yüklenmesini bekleyelim
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //switch to the frame using Id/Name of the frame
     //   driver.switchTo().frame(0);
        WebElement frame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1);

        WebElement text1 =driver.findElement(By.id("sampleHeading"));
        String frame1Text = text1.getText();
        System.out.println(frame1Text);

        WebElement frame2 = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2);

        WebElement text2 =driver.findElement(By.id("sampleHeading"));
        String frame2Text = text2.getText();
        System.out.println(frame2Text);

    }
}
