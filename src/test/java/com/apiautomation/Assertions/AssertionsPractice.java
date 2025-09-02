package com.apiautomation.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsPractice {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_Method_CreateBooking()
    {
        String payload = "{\n" +
                "    \"firstname\" : \"Karthick\",\n" +
                "    \"lastname\" : \"Kumar\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .body(payload);

        response = r.when().log().all().post();

        vr = response.then().log().all().statusCode(200);
        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Karthick"));

        Assert.assertEquals("booking.firstname", "Karthick" );

    }
}
