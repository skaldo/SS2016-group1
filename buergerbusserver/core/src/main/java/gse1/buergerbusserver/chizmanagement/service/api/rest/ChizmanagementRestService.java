package gse1.buergerbusserver.chizmanagement.service.api.rest;

import gse1.buergerbusserver.chizmanagement.logic.api.to.ChizEto;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/chizmanagement/v1")
public interface ChizmanagementRestService {

  @GET
  @Path("/chizs/")
  public List<ChizEto> listAllChizs();
}
