package com.guru99.learn;

import org.openqa.selenium.By;

/**
 * Created by binh.nt on 5/2/2017.
 */
public class Elements extends DriverManager{

    public boolean loginPage(){
        return true;
    }

    public void isOnLoginPage(){
        driver.findElement(By.name("uid"));
        driver.findElement(By.name("password"));
        driver.findElement(By.name("btnLogin"));
        driver.findElement(By.name("btnReset"));
    }

    public void isOnLoginSuccessPage(){

    }
}
