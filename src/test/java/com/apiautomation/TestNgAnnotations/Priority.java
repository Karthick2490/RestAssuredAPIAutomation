package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 1)
    public void test_t1()
    {
        System.out.println("Test 1 Method!");
    }

    @Test(priority = 2)
    public void test_t2()
    {
        System.out.println("Test 2 Method!");
    }

    @Test(priority = 3)
    public void test_t5()
    {
        System.out.println("Test 5 Method!");
    }

    @Test(priority = 4)
    public void test_t4()
    {
        System.out.println("Test 4 Method!");
    }

    @Test(priority = 5)
    public void test_t3()
    {
        System.out.println("Test 3 Method!");
    }
}
