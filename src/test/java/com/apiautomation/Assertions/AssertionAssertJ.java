package com.apiautomation.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class AssertionAssertJ {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_TC01_CreateBooking_Positive()
    {
        String Paylload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .body(Paylload)
                .contentType(ContentType.JSON);
        response = r.when().log().all().post();

        Integer bookingid = response.jsonPath().getInt("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.jsonPath().getString("booking.lastname");
        Assert.assertEquals(firstname, "Jim");

        Assert.assertEquals(lastname, "Brown");

        assertThat(bookingid).isPositive().isNotNull().isNotZero();
    }
}
