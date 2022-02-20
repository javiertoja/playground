package org.acme.service;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.acme.api.SimpleDao;
import org.acme.api.SimpleEntity;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
@TestHTTPEndpoint(SimpleEntityResource.class)
class SimpleEntityResourceTest {

    @InjectMock
    SimpleDao mockDao;

    @Test
    void getEntities() {
        Mockito.doReturn(List.of(new SimpleEntity("mocked", 1L)))
                .when(mockDao).getEntities();

        var entries = when().get()
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(SimpleEntity[].class);

        assertEquals(entries.length, 1);
    }
}