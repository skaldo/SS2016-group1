package gse1.buergerbusserver.linemanagement.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;
import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;

/**
 * @author razadfki
 *
 */
@Named
@Component
@Transactional
public class LinemanagementImpl extends AbstractComponentFacade implements Linemanagement {

  @Inject
  private LineDao lineDao;

  @Inject
  private BusDao busDao;

  @Inject
  private RouteDao routeDao;

  @Override
  public List<LineEto> getAllLines() {

    try {
      return getBeanMapper().mapList(this.lineDao.findAll(), LineEto.class);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
      return null;
    }

  }

  @Override
  public List<BusEto> getAllBuses() {

    // List<BusEntity> buses = this.busDao.findAll();
    // return getBeanMapper().mapList(buses, BusEto.class);
    try {
      return getBeanMapper().mapList(this.busDao.findAll(), BusEto.class);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<BusEto> getBusesOnLine(Long lineId) {

    List<BusEntity> buses = this.busDao.getBusesOnLine(lineId);
    return getBeanMapper().mapList(buses, BusEto.class);
  }

  @Override
  public List<RouteEto> getAllRoutes() {

    return getBeanMapper().mapList(this.routeDao.findAll(), RouteEto.class);
  }
}
