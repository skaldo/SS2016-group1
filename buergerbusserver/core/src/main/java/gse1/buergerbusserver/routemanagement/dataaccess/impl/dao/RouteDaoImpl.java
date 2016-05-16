package gse1.buergerbusserver.routemanagement.dataaccess.impl.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.routemanagement.dataaccess.api.RouteEntity;
import gse1.buergerbusserver.routemanagement.dataaccess.api.dao.RouteDao;

/**
 * @author MZEEN
 *
 */
public class RouteDaoImpl extends ApplicationMasterDataDaoImpl<RouteEntity> implements RouteDao {

  /**
   * The constructor.
   */
  public RouteDaoImpl() {
    super();
  }

  @Override
  protected Class<RouteEntity> getEntityClass() {

    return RouteEntity.class;
  }

  @Override
  public List<RouteEntity> getAllRoutes() {

    // TODO Auto-generated method stub
    return null;
  }
}
