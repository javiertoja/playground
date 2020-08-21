package org.acme.hibernate.orm;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class FruitsEndpointTest {

    @Test
    public void testIssue() {

        given()
                .when().get("/fruits")
                .then()
                .statusCode(200);
    }
}
