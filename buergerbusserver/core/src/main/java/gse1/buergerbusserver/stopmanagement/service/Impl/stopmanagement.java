package gse1.buergerbusserver.stopmanagement.service.Impl;

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
public interface stopmanagement {
  /*
   * @GET
   * 
   * @Path("/stops/")
   */

  /**
   * @return
   */
  @SuppressWarnings("javadoc")
  List<stopEto> listAllstops();

  /**
   * @return
   */
  /* List<stopEto> getAllstops(); */

  /**
   * @param lineIdLong
   * @return
   */
  /* List<stopEto> findstopsOnLine(long lineIdLong); */
}
