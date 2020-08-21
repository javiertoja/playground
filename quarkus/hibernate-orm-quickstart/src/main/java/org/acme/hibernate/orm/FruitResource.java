package org.acme.hibernate.orm;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("fruits")
@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
public class FruitResource {

    private static final Logger LOGGER = Logger.getLogger(FruitResource.class.getName());

    @Inject
    EntityManager entityManager;

    @GET
    @Transactional
    public List<Fruit> get() {

        entityManager.createQuery("SELECT f FROM Fruit f ORDER BY f.name",Fruit.class)
                .getResultList();

        entityManager.createQuery("SELECT f FROM Fruit f ORDER BY f.name",Fruit.class)
                .getResultList();

        entityManager.createQuery("SELECT f FROM Fruit f ORDER BY f.name",Fruit.class)
                .getResultList();

        return entityManager.createNamedQuery("Fruits.findAll", Fruit.class)
                .getResultList();
    }

}
