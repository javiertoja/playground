package org.acme.leanxcale;

import io.quarkus.arc.Priority;
import org.acme.api.SimpleDao;
import org.acme.api.SimpleEntity;

import javax.inject.Singleton;
import java.util.List;

@Priority(Integer.MAX_VALUE)
@Singleton
public class LeanXcaleSimpleDao implements SimpleDao {


    @Override
    public List<SimpleEntity> getEntities() {
        return List.of(new SimpleEntity("leanxcale1", 50L),
                new SimpleEntity("leanxcale2", 70L)
        );
    }

}
