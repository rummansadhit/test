package com.letskodeit.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarPage {

    public SearchBarPage(WebDriver driver){

        this.driver = driver;
    }
    public WebDriver driver;

    private String SEARCH_COURSE_FIELD = "//input[@id='search']";
    private String SEARCH_COURSE_BUTTON = "//button[@class='find-course search-course']";

    public ResultPage course(String courseName){

        WebElement searchElement = driver.findElement(By.xpath(SEARCH_COURSE_FIELD));
        searchElement.clear();
        searchElement.sendKeys(courseName);
        WebElement searchButton = driver.findElement(By.xpath(SEARCH_COURSE_BUTTON));
        searchButton.click();

        return new ResultPage(driver);
    }

}
