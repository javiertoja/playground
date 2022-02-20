package org.acme.service;

import org.acme.api.SimpleDao;
import org.acme.api.SimpleEntity;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Path("/simple-entity")
public class SimpleEntityResource {

    @Inject
    SimpleDao dao;


    @GET
    public Collection<SimpleEntity> getEntities() {
        return dao.getEntities();
    }

}
