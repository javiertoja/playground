package gal.inverbis.testcsv;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resteasy/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @POST
    @Consumes("text/csv")
    @Produces("text/csv;charset=utf-8")
    public Response upload(InputStream data){
        return Response.ok(data).header("Content-Disposition","attachment; filename=test.csv").build();
    }
}