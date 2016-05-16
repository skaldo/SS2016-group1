package gse1.buergerbusserver.routemanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.routemanagement.logic.api.to.RouteEto;

/**
 * @author MZEEN
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/Routemanagement/v1")
public interface RoutemanagementRestService {
  /**
   * @return getAllRoutes
   */
  public List<RouteEto> getAllRoutes();

}
