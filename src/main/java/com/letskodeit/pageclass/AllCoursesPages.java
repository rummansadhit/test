package com.letskodeit.pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllCoursesPages {

        public AllCoursesPages(WebDriver driver){
            this.driver = driver;
        }

        public WebDriver driver;
        private String URL = "https://learn.letskodeit.com/courses";
        private String ALL_COURSE = "//a[contains(text(),'All Courses')]";

        public void open(){

            driver.findElement(By.xpath(URL)).click();

        }
        public boolean isOpen(){

            return URL.equalsIgnoreCase(driver.getCurrentUrl());

        }

}
