package il.ac.shenkar.showshenkar.backend.api;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

import java.util.List;

import il.ac.shenkar.showshenkar.backend.OfyService;
import il.ac.shenkar.showshenkar.backend.model.Route;

/**
 * Created by:  Gregory Kondratenko on 10/06/2016.
 * Description: Backend api for app projects
 */
@Api(
        name = "routeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.showshenkar.shenkar.ac.il",
                ownerName = "backend.showshenkar.shenkar.ac.il",
                packagePath=""
        )
)
public class RouteApi {

    @ApiMethod(
            name = "getRoute",
            path = "routeApi/{id}",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public Route getRoute(@Named("id") String id){
        return OfyService.ofy().load().type(Route.class).filter("id", id).first().now();
    }

    @ApiMethod(
            name = "getRoutes",
            path = "routeApi",
            httpMethod = ApiMethod.HttpMethod.GET
    )
    public List<Route> getRoutes(){
        return OfyService.ofy().load().type(Route.class).list();
    }

    @ApiMethod(
            name = "setRoute",
            path = "routeApi",
            httpMethod = ApiMethod.HttpMethod.POST
    )
    public Route setRoute(Route route){
        if (route == null){
            throw new IllegalStateException("Route is null");
        }

        if (route.getId() != null) {
            throw new IllegalStateException("Route already exits");
        }

        OfyService.ofy().save().entity(route).now();
        return route;
    }
}
