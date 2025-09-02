package com.apiautomation.RestAssured_HttpMethods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BDDStyle {
    @Test
    public void test_Get_Positive_Pincode()
    {
        String Pincode = "600043";
        RestAssured.given().baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
