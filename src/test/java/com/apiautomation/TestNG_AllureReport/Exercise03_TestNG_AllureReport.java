package com.apiautomation.TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Exercise03_TestNG_AllureReport {
    @Test
    public void test_Get_Positive_TC1()
    {
        String Pincode = "600043";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_Get_Negative_TC2()
    {
        String Pincode = "@";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }
    @Test
    public void test_Get_NegativeTC3()
    {
        String Pincode = " ";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

    }

}
