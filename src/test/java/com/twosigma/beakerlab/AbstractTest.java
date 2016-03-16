package com.twosigma.beakerlab;

import com.twosigma.beakerlab.common.Environment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Pavel on 14.03.2016.
 */
public abstract class AbstractTest {

    protected WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/"+ Environment.getDriver());

        driver = new ChromeDriver();

    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }
}
