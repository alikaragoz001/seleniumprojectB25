package com.cydeo.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Linktext_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("hhtps://practice.cydeo.com");

        //Thread.sleep(2000);

        //driver.findElement(By.linkText("A/B Testing"));
        WebElement abTestLink =  driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Verified");
        }else{
            System.out.println("Title verification failed");
        }

        driver.navigate().back();

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(actualTitle2.equals(expectedTitle2)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification failed");
        }


    }
}
