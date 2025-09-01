package com.apiautomation.Exercise02;

import io.restassured.RestAssured;

public class MultipleTestCases {
    public static void main(String[] args) {
        String Pincode = "600043";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        Pincode = "@";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        Pincode = " ";
        RestAssured.given()
                .baseUri("https://zippopotam.us/")
                .basePath("/IN/" +Pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
