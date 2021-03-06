package gse1.buergerbusserver.linemanagement.logic.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LastPositionEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.LineEntity;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.BusDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LastPositionDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.LineDao;
import gse1.buergerbusserver.linemanagement.dataaccess.api.dao.RouteDao;
import gse1.buergerbusserver.linemanagement.logic.api.Linemanagement;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LastPositionEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineWithBusIdsCto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;
import gse1.buergerbusserver.schedulemanagement.dataaccess.api.dao.StopDao;

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

  @Inject
  private StopDao stopDao;

  @Inject
  private LastPositionDao lastPositionDao;

  @Override
  public List<LineEto> getAllLines() {

    try {

      List<LineEntity> lines = this.lineDao.findAll();
      return getBeanMapper().mapList(lines, LineEto.class);
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
      List<BusEntity> buses = this.busDao.findAll();
      return getBeanMapper().mapList(buses, BusEto.class);
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

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllRoutes() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();
    List<RouteEto> routeEtoList = getBeanMapper().mapList(this.routeDao.findAll(), RouteEto.class);
    returnHM.put("routes", routeEtoList);
    returnHM.put("timeStamp", this.routeDao.lastUpdate());

    return returnHM;
  }

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllLinesWithBusIds() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();
    List<LineWithBusIdsCto> lineCtoList = getBeanMapper().mapList(this.lineDao.findAll(), LineWithBusIdsCto.class);

    for (LineWithBusIdsCto lineCto : lineCtoList) {
      List<BusEntity> buses = this.busDao.getBusesOnLine(lineCto.getId());
      lineCto.setBuses(getBeanMapper().mapList(buses, BusEto.class));
    }

    returnHM.put("lines", lineCtoList);
    returnHM.put("timeStamp", this.lineDao.lastUpdate());

    return returnHM;
  }

  @Override
  public void updateBusStatus(Long busId, Long lineId) {

    try {
      this.busDao.updateBusStatus(busId, lineId);
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  @Override
  public HashMap<String, Date> checkUpdate() {

    HashMap<String, Date> updates = new HashMap<>();
    updates.put("busses", this.busDao.lastUpdate());
    updates.put("lines", this.lineDao.lastUpdate());
    updates.put("routes", this.routeDao.lastUpdate());
    updates.put("stops", this.stopDao.lastUpdate());
    return updates;
  }

  @SuppressWarnings("unused")
  @Override
  public HashMap<String, Object> getAllBusesListWithTimeStamp() {

    HashMap<String, Object> returnHM = new HashMap<String, Object>();

    returnHM.put("busses", getAllBuses());
    returnHM.put("timeStamp", this.busDao.lastUpdate());
    return returnHM;
  }

  @Override
  public LastPositionEto getLastPosition(Long busId) {

    try {
      LastPositionEntity lastPosition = this.lastPositionDao.getLastPosition(busId);
      return getBeanMapper().map(lastPosition, LastPositionEto.class);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public void setLastPosition(Long busId, double lon, double lat) {

    try {
      this.lastPositionDao.setLastPosition(busId, lon, lat);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
