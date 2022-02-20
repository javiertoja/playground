package org.acme.api;

import java.util.List;

/**
 * Common dao interface that allows portability and polymorphism
 */
public interface SimpleDao {

    List<SimpleEntity> getEntities();

}
