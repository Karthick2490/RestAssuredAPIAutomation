package com.apiautomation.RestAssured_HttpMethods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Delete_NonbddStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String bookingID = "2883";
    String token = "97229ab6a35aa2a";

    @Test
    public void test_Delete_Positive_TC01()
    {
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("booking/" +bookingID);
        r.cookie("token", token);
        r.contentType(ContentType.JSON);

        response = r.when().log().all().delete();

        vr = response.then().log().all().statusCode(201);
    }
}
