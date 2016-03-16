package com.twosigma.beakerlab.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Pavel on 14.03.2016.
 */
public class Environment {

    private static String appUrl;

    private static String driver;

    public static String getDriver() {

        return driver;
    }

    public static String getAppUrl() {
        return appUrl;
    }

    private static Environment instance = null;

    private static Properties config = new Properties();



    static {

        try{

            String propertiesFile = System.getProperty("propertiesFile");
            if(propertiesFile == null){
                propertiesFile = "local.properties";

            }
            InputStream fs = new FileInputStream("src/test/resources/"+propertiesFile);
            config.load(fs);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        appUrl = config.getProperty("app.url");

        driver = config.getProperty("driver.browser");


    }

    public Environment getInstance(){
        if(instance==null){
            instance=new Environment();
        }

        return instance;
    }
}
