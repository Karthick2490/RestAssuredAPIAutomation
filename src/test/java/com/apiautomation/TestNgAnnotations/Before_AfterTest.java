package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_AfterTest {
    @BeforeTest
    public void test_GetToken()
    {
        System.out.println("Get the Token");
    }

    @BeforeTest
    public void GetBookingId()
    {
        System.out.println("Get the Booking ID");
    }
    @Test
    public void test_Put()
    {
        System.out.println("Update the Booking Details");
    }

    @AfterTest
    public void CloseAll()
    {
        System.out.println("Close the browser");
    }

}
