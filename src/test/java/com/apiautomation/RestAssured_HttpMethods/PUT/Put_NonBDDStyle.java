package com.apiautomation.RestAssured_HttpMethods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Put_NonBDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String payload = "{\n" +
            "    \"firstname\": \"James\",\n" +
            "    \"lastname\": \"Brown\",\n" +
            "    \"totalprice\": 111,\n" +
            "    \"depositpaid\": true,\n" +
            "    \"bookingdates\": {\n" +
            "        \"checkin\": \"2018-01-01\",\n" +
            "        \"checkout\": \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\": \"Breakfast\"\n" +
            "}";
    String bookingID = "3504";
    String token = "4ba4bf2250d6b64";

    @Test
    public void test_Put_Positive_TC01()
    {
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("booking/" +bookingID);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all().statusCode(200);
    }
}
