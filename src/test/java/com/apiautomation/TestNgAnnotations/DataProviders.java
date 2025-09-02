package com.apiautomation.TestNgAnnotations;

import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
    @DataProvider(name = "endpoints")
    public Object [][] GetData()
    {
        return new Object[][]
                {{"/names"},{"/admin"}
                };
    }

    @Test(dataProvider = "endpoints")
    public void test_TC01(String endpoint)
    {
        RestAssured.given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .when().get(endpoint).then().statusCode(200);
    }
}
