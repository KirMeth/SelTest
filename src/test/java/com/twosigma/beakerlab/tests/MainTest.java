package com.twosigma.beakerlab.tests;


import com.twosigma.beakerlab.AbstractTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest extends AbstractTest{

    @Test(enabled = true)
    public void Test(){

        driver.get("https://www.google.by/");
        assert driver.findElement(By.tagName("body"))
                .isDisplayed()==true;
        System.out.println(driver.getTitle());



    }

    @Test()
    public void Test1(){
        System.out.println("In Test");
    }
}
