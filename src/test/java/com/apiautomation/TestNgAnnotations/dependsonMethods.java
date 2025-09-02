package com.apiautomation.TestNgAnnotations;

import org.testng.annotations.Test;

public class dependsonMethods {
    @Test
    public void ServerStartedOk()
    {
        System.out.println("Server STARTED!");
    }

    @Test(dependsOnMethods = "ServerStartedOk")
    public void TokenGeneration()
    {
        System.out.println("Token Generation");
    }
}
