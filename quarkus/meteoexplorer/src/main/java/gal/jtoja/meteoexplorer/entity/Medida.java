package gal.jtoja.meteoexplorer.entity;

import javax.json.bind.annotation.JsonbCreator;

record Medida (
    String codigoParametro,
    Integer lnCodigoValidacion,
    String nomeParametro,
    String unidade,
    Double valor
){
    @JsonbCreator
    public Medida{}
}
