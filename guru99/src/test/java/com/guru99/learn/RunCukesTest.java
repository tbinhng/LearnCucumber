package com.guru99.learn;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by binh.nt on 5/2/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                    tags = "")
public class RunCukesTest {
}
