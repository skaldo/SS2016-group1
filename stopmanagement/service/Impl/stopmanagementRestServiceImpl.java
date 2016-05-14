package gse1.buergerbusserver.stopmanagement.service.Impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.websocket.server.PathParam;
import javax.ws.rs.BadRequestException;

import gse1.buergerbusserver.stopmanagement.logic.api.to.stopEto;
import gse1.buergerbusserver.stopmanagement.service.api.rest.stopmanagementRestService;

/**
 * @author JAYU
 *
 */
@Named("stopmanagementRestService")
public class stopmanagementRestServiceImpl implements stopmanagementRestService {

  @Inject
  private stopmanagement stopmanagement;

  @Override
  public List<stopEto> listAllstops() {

    List<stopEto> allstops = this.stopmanagement.listAllstops();
    return allstops;
  }

  @Override
  public List<stopEto> getAllstops() {

    return this.stopmanagement.getAllstops();
  }

  @Override
  public List<stopEto> listAllstopsonLine(@PathParam("lineId") String lineId) {

    long lineIdLong;
    if (lineId == null) {
      throw new BadRequestException("missing line id");
    }
    try {
      lineIdLong = Long.parseLong(lineId);
    } catch (NumberFormatException e) {
      throw new BadRequestException("Line id is not a number");
    }
    List<stopEto> linestops = this.stopmanagement.findstopsOnLine(lineIdLong);
    return linestops;
  }
}
