package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"Regression"})
    public void Regression_TC01()
    {
        System.out.println("Regression Test Cases");
    }

    @Test(groups = {"Regression"})
    public void Regression_TC02()
    {
        System.out.println("Regression Test Cases - No:2");
    }

    @Test(groups = {"Sanity","Regression"})
    public void Sanity()
    {
        System.out.println("Sanity Test Cases");
    }

    @Test(groups = {"Smoke","Regression"})
    public void Smoke()
    {
        System.out.println("Smoke Test Cases");
    }
}
