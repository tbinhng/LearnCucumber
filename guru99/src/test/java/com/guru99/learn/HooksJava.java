package com.guru99.learn;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by binh.nt on 5/2/2017.
 */
public class HooksJava {

    @Before

    public void setUp(){
        new DriverManager().openBrowser();
    }

    @After
    public void tearDown(){
        new DriverManager().closeBroser();
    }
}
