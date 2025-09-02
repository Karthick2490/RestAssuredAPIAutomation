package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.Test;

public class Invocation {
    @Test(invocationCount = 3)
    public void test_Method()
    {
        System.out.println("Invocation count!");
    }

}
