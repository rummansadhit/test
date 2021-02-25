package com.letskodeit.pageclass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


    public LoginPage(WebDriver driver){

        this.driver = driver;

    }
    private WebDriver driver;

    public String LOGIN_LINK = "//a[@href='/sign_in']";
    private String EMAIL_FIELD = "email"; //id
    private String PASSWORD_FIELD = "password"; //id
    private String LOGIN_BUTTON_LINK= "//input[@value='Login']";

    public void open(){

        driver.findElement(By.xpath(LOGIN_LINK)).click();
    }

    public NavigationPage signInWith(String email, String password){

        WebElement emailElement = driver.findElement(By.id(EMAIL_FIELD));
        emailElement.clear();
        emailElement.sendKeys(email);
        WebElement passwordField= driver.findElement(By.id(PASSWORD_FIELD));
        passwordField.sendKeys(password);

        WebElement logButton = driver.findElement(By.xpath(LOGIN_BUTTON_LINK));
        logButton.click();

        return new NavigationPage(driver);

    }




}
