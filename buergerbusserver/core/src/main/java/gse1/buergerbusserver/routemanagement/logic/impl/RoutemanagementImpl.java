package gse1.buergerbusserver.routemanagement.logic.impl;

import java.util.List;

import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.routemanagement.dataaccess.api.dao.RouteDao;
import gse1.buergerbusserver.routemanagement.logic.api.Routemanagement;
import gse1.buergerbusserver.routemanagement.logic.api.to.RouteEto;

/**
 * @author MZEEN
 *
 */

@Named
@Component
@Transactional
public class RoutemanagementImpl extends AbstractComponentFacade implements Routemanagement {

  // @inject
  private RouteDao routeDao;

  /**
   * The constructor.
   */
  public RoutemanagementImpl() {
    super();
  }

  @Override
  public List<RouteEto> getAllRoutes() {

    return getBeanMapper().mapList(this.routeDao.findAll(), RouteEto.class);
  }
}
