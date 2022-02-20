package org.acme.mongodb;

import com.mongodb.client.MongoClients;
import io.quarkus.arc.Priority;
import org.acme.api.SimpleDao;
import org.acme.api.SimpleEntity;

import javax.inject.Singleton;
import java.util.List;

@Priority(Integer.MAX_VALUE)
@Singleton
public class MongoDbSimpleDao implements SimpleDao {

    @Override
    public List<SimpleEntity> getEntities() {

        MongoClients.create();

        return List.of(new SimpleEntity("mongo1", 20L),
                new SimpleEntity("mongo4", 45L)
        );
    }

}
