package gse1.buergerbusserver.routemanagement.logic.api.to;

import java.util.Date;

import gse1.buergerbusserver.routemanagement.common.api.Route;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author MZEEN
 *
 */
public class RouteEto extends AbstractEto implements Route {

  private String gpsdata;

  private Date timeStamp;

  /**
   * @return gpsdata
   */
  @Override
  public String getGpsData() {

    return this.gpsdata;
  }

  /**
   * @param gpsdata new value of {@link #getgpsdata}.
   */
  @Override
  public void setGpsData(String gpsData) {

    this.gpsdata = gpsData;
  }

  /**
   * @return timeStamp
   */
  @Override
  public Date getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #getTimeStamp}.
   */
  @Override
  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;
  }

}
