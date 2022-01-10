package com.seleniumappium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFirstScript {

    public static void main(String[] args) {

        //open the chrome browser
        System.setProperty("webdriver.chrome.driver", "/Users/merveagarak/IdeaProjects/SeleniumDrivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.mortgagecalculator.org/");

        //Find the element via locators (=id;name;Xpath etc)
        WebElement homeValueElement = driver.findElement(By.id("homeval"));

        //Perform the element
        homeValueElement.clear();
        homeValueElement.sendKeys("1000");

        //Working with Dropdown/SelectBox
        WebElement startMonthElement = driver.findElement(By.name("param[start_month]"));
        Select select = new Select(startMonthElement);
        select.selectByIndex(2);
        // select.selectByVisibleText("Mar");
        //select.selectByValue("3");

        //Working with Button
        WebElement calButton = driver.findElement(By.name("cal"));
        calButton.click();

    }
}
