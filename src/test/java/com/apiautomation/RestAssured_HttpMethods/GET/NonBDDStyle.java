package com.apiautomation.RestAssured_HttpMethods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String Pincode = "600043";

    @Test
    public void test_Get_Positive_01()
    {
        r = RestAssured.given();
        r.baseUri("https://zippopotam.us/");
        r.basePath("/IN/" +Pincode);

        response = r.when().log().all().get();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
