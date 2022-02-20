package org.acme.service;

import io.quarkus.arc.Priority;
import org.acme.api.SimpleDao;
import org.acme.api.SimpleEntity;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@Priority(1)
@ApplicationScoped
public class NoOpSimpleDao implements SimpleDao {
    @Override
    public List<SimpleEntity> getEntities() {
        return null;
    }
}
