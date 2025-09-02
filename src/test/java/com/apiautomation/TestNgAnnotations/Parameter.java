package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.*;

public class Parameter{
    @Parameters("browser")
    @Test
    public void Browsers(String value)
    {
        if(value.equalsIgnoreCase("chrome"))
        {
            System.out.println("Start the Chrome Browser");
        }

        if(value.equalsIgnoreCase("firefox"))
        {
            System.out.println("Start the firefox Browser");
        }
    }
}
