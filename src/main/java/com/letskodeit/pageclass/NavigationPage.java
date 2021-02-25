package com.letskodeit.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {

    public NavigationPage(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driver;

    private String MY_COURSE =  "//a[@href=\'/courses/enrolled\']";
    private String ALL_COURSE = "//a[@href='/courses']";
    private String PRACTICE = "//a[@href='/pages/practice']";
    private String LoginLink = "//a[contains(text(),'Sign In')]";

    public void allCourse(){

        driver.findElement(By.xpath(ALL_COURSE)).click();
    }
    public void myCourse(){

        driver.findElement(By.xpath(MY_COURSE));




    }


    public LoginPage Login() {
        driver.findElement(By.xpath(LoginLink)).click();
        return new LoginPage(driver);

    }
}
