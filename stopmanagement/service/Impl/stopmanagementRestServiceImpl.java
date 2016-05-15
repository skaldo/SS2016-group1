package gse1.buergerbusserver.stopmanagement.service.Impl;

import java.util.List;

/*import javax.inject.Inject;
import javax.inject.Named;*/

import gse1.buergerbusserver.stopmanagement.logic.api.to.stopEto;
import gse1.buergerbusserver.stopmanagement.service.api.rest.stopmanagementRestService;

/**
 * @author JAYU
 *
 */
/* @Named("stopmanagementRestService") */
public class stopmanagementRestServiceImpl implements stopmanagementRestService {

  /* @Inject */
  private stopmanagement stopmanagement;

  @Override
  public List<stopEto> listAllstops() {

    return this.stopmanagement.listAllstops();

    /**
     * List<stopEto> allstops = this.stopmanagement.listAllstops(); return allstops;
     */
  }

}
/*
 * @Override public List<stopEto> getAllstops() {
 *
 * return this.stopmanagement.getAllstops(); }
 */

/*
 * @Override public List<stopEto> listAllstopsonLine(@PathParam("lineId") String lineId) {
 *
 * return null; } }
 */
