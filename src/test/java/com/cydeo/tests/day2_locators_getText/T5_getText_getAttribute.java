package com.cydeo.tests.day2_locators_getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class T5_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration form");

        WebElement headerText = driver.findElement(By.tagName("h2"));
        String expectedHeaderText = "Registration Form";
        String actualHeaderText  = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("HeaderText Verification passed!");
        }else{
            System.out.println("HeaderText Verification failed!");
        }

        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");



    }
}
