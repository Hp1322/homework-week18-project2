package com.restapiexample.dummy.dummyapiinfo;

import com.restapiexample.dummy.constants.EndPoints;
import com.restapiexample.dummy.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class FirstTest extends TestBase {

    @Test
    public void getAllProduct(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_EMPLOYEES)
                .then()
                .log().all()
                .statusCode(200);
    }
}
