package com.apiautomation.Exercise01;

import io.restassured.RestAssured;

public class RestAssured_PincodeAPI {
    public static class RestAssured_Pincode {
        public static void main(String[] args) {
            RestAssured.given()
                    .baseUri("https://api.postalpincode.in/pincode/601203")
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(200);
        }
    }
}
