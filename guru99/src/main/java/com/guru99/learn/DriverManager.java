package com.guru99.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by binh.nt on 5/2/2017.
 */
public class DriverManager {

    public static WebDriver driver;
    public void openBrowser(){

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/config.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }

        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.demo.guru99.com/V4/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBroser(){
        driver.close();
    }
}
