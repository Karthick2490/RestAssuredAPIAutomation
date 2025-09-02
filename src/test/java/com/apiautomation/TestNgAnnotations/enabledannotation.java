package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.Test;

public class enabledannotation {
    @Test(enabled = false)
    public void test_Method()
    {
        System.out.println("Enabled - False annotations");
    }
    @Test(enabled = true)
    public void test_Method2()
    {
        System.out.println("Enabled - True annotations");
    }

    @Test
    public void test_Method3()
    {
        System.out.println("Enabled - annotations");
    }
}
