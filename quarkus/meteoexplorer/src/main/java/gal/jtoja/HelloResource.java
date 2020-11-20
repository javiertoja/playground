package gal.jtoja;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.inject.Inject;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyVisibilityStrategy;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import gal.jtoja.meteoexplorer.control.MeteogaliciaRestClient;
import gal.jtoja.meteoexplorer.entity.MedidasEstacion;

@Path("/hello")
public class HelloResource {

    @Inject
    @RestClient
    MeteogaliciaRestClient meteogaliciaSvc;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        var visibilityStrategy = new PropertyVisibilityStrategy() {
            @Override
            public boolean isVisible(Field field) {
                return true;
            }

			@Override
			public boolean isVisible(Method method) {
				// TODO Auto-generated method stub
				return false;
			}
        };


        var jsonb = JsonbBuilder.create(
            new JsonbConfig()
                    .withFormatting(true)
                    .withPropertyVisibilityStrategy(visibilityStrategy)
        );


        var resultado = meteogaliciaSvc.getInfoEstacion(10124);



        return jsonb.fromJson(resultado.toString(),MedidasEstacion.class).toString();
    }
}