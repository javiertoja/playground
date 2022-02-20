package org.acme.leanxcale;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class LeanXcaleSimpleDaoTest {

    @Test
    public void testLeanXcaleDao() {

        var dao = new LeanXcaleSimpleDao();

        assertEquals(2, dao.getEntities().size());
    }
}