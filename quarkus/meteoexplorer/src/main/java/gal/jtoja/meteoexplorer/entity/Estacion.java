package gal.jtoja.meteoexplorer.entity;

import java.util.Collection;

import javax.json.bind.annotation.JsonbCreator;

record Estacion(
    String estacion,
    Integer idEstacion,
    String instanteLecturaUTC,
    Collection<Medida> listaMedidas
) {
    @JsonbCreator
    public Estacion{}
}
