package gse1.buergerbusserver.routemanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author MZEEN
 *
 */
public interface Route extends ApplicationEntity {

  void setgpsdata(String gpsdata);

  String getgpsdata();

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();
}
