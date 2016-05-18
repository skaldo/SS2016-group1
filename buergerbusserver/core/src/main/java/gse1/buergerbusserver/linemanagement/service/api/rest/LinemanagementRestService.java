package gse1.buergerbusserver.linemanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;

/**
 * @author ahsan
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/linemanagement/v1")
public interface LinemanagementRestService {

  @GET
  @Path("/lines/")
  public List<LineEto> getAllLines();

  /**
   * Delegates to {@link Busmanagement#findBusesOnLine(Long)}.
   *
   * @param lineId ID of requested line
   * @return {@link List} of {@link BusEto} objects serving the {@link Line} lineID
   */
  @GET
  @Path("/buses/{lineId}/")
  public List<BusEto> getBusesOnLine(@PathParam("lineId") String lineId);

  /**
   * Delegates to {@link Busmanagement#findAllBuses()}.
   *
   * @return {@link List} of {@link BusEto} objects
   */
  @GET
  @Path("/buses/")
  public List<BusEto> getAllBuses();

  /**
   * @return getAllRoutes
   */
  @GET
  @Path("/routes/")
  public List<RouteEto> getAllRoutes();
}
