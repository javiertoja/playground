package gal.jtoja.meteoexplorer.control;

import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import gal.jtoja.meteoexplorer.entity.MedidasEstacion;

@RegisterRestClient(baseUri = "https://servizos.meteogalicia.gal/rss/observacion/ultimos10minEstacionsMeteo.action")
public interface MeteogaliciaRestClient {


    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject getInfoEstacion(@QueryParam("idEst") Integer idEstacion);
}
