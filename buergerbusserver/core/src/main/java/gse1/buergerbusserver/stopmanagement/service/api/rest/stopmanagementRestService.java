package gse1.buergerbusserver.stopmanagement.service.api.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.stopmanagement.logic.api.to.stopEto;

/**
 * @author JAYU
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/stopmanagement/v1")
public interface stopmanagementRestService {

  /**
   * @return
   */
  @SuppressWarnings("javadoc")

  /*
   * @GET
   *
   * @Path("/stops/{LineId}") public List<stopEto> listAllstopsonLine(String LineId);
   */

  /*
   * @GET
   * 
   * @Path("/stops")
   */
  public List<stopEto> listAllstops();

  /*
   * @GET
   *
   * @Path("/stops/{LineId}") List<stopEto> getAllstops();
   */

}