package dk.mbang;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/color")
public class ColorResource {

    @Inject
    ColorService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/default")
    public String defaultColor() {
        return service.defaultColor();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hostname")
    public String hostName() {
        return "hostname";
    }

    //@GET
    //@Produces(MediaType.TEXT_PLAIN)
    //@Path("/greeting/{name}")
    //public String greeting(String name) {
    //    return service.greeting(name);
    //}

    //@GET
    //@Produces(MediaType.TEXT_PLAIN)
    //public String hello() {
    //    return "Hello from Quarkus REST";
    //}
}
