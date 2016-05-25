package gse1.buergerbusserver.linemanagement.logic.api;

import java.util.List;

import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.logic.api.to.BusEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineEto;
import gse1.buergerbusserver.linemanagement.logic.api.to.LineWithBusIdsCto;
import gse1.buergerbusserver.linemanagement.logic.api.to.RouteEto;

/**
 * @author razadfki
 *
 */

public interface Linemanagement {

  public List<LineEto> getAllLines();

  /**
   * Returns a {@link List} of all buses in the system.
   *
   * @return List of {@link BusEto} objects for all buses
   */
  List<BusEto> getAllBuses();

  /**
   * Returns a {@link List} of all buses serving the {@link Line} as given by lineId.
   *
   * @param lineId
   * @return List of {@link BusEto} objects of buses on line lineId.
   */
  List<BusEto> getBusesOnLine(Long lineId);

  public List<RouteEto> getAllRoutes();

  public List<LineWithBusIdsCto> getAllLinesWithBusIds();

  void updateBusStatus(Long busId, Long lineId);

}