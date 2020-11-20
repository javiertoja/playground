package gal.jtoja.meteoexplorer.entity;

import java.util.Collection;

import javax.json.bind.annotation.JsonbCreator;

public record MedidasEstacion(
    Collection<Estacion> listUltimos10min
) {
    
    @JsonbCreator
    public MedidasEstacion{}
}
