package be.mabi.ohana.smurf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static be.mabi.ohana.smurf.SmurfResource.SMURF_BASE_URL;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@Produces(APPLICATION_JSON_UTF8_VALUE)
@Path(SMURF_BASE_URL)
public interface SmurfResource {

    String SMURF_BASE_URL = "smurf";

    @GET
    Response all();

}
