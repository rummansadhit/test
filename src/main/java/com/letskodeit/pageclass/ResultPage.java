package com.letskodeit.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPage {


    ResultPage(WebDriver driver){

        this.driver=driver;
    }

    public WebDriver driver;

    private String URL = "query=";

    private String COURSE_LIST = "//img[@alt='course image']";

    public boolean isOpen(){

        return driver.getCurrentUrl().contains(URL);
    }

    public int courseCount(){
        List<WebElement> CourseList  = driver.findElements(By.xpath(COURSE_LIST));
        return CourseList.size();
    }

    public boolean verifyPage(){
        boolean result= false;
        if(courseCount() > 0){
            result = true;
        }
        return result;
    }

    public boolean filercontentCount(int ExpectedOutput){

        return courseCount() == ExpectedOutput;
    }

}
