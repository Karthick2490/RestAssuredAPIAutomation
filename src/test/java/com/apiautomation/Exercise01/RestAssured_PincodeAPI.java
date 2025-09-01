package com.apiautomation.Exercise01;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RestAssured_PincodeAPI {
        public static void main(String[] args) {
            try {
                RestAssured.given()
                        .baseUri("https://api.postalpincode.in/pincode/601203")
                        .when()
                        .get()
                        .then()
                        .log().all()
                        .statusCode(200)
                        .contentType(ContentType.JSON)
                        .body(matchesJsonSchemaInClasspath("Pincode-Schema.json"));
                System.out.println("Schema Validated");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
