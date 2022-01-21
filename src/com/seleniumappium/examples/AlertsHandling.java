package com.seleniumappium.examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/merveagarak/IdeaProjects/SeleniumDrivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        WebElement proceedBtn = driver.findElement(By.id("details-button"));
        proceedBtn.click();
        WebElement proceedLink = driver.findElement(By.id("proceed-link"));
        proceedLink.click();

        WebElement button = driver.findElement(By.id("promtButton"));
        button.click();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.sendKeys("Merve Agarak was here");
        try {
            Thread.sleep(4*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.accept(); // OK
//     alert.dismiss(); //Cancel
    //    driver.close();

    }
}
