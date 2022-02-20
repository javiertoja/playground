package org.acme.mongodb;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MongoDbSimpleDaoTest {


    @Test
    void getEntities() {

        var dao = new MongoDbSimpleDao();

        assertEquals(2, dao.getEntities().size());
    }
}