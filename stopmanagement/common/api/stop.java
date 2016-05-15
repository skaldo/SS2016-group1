package gse1.buergerbusserver.stopmanagement.common.api;

import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author JAYU
 *
 */

public interface stop extends ApplicationEntity {

  /*
   * @Override void setId(Long id);
   * 
   * @Override Long getId();
   *
   *
   */
  void setName(String name);

  String getName();

  void setLines(Long Id);

  Long getLines(Long Id);

  void setSchedule(String LineId, Date Time);

  String getSchedule();

  void setLocation(String gpsdata);

  String getLocation();

  void setTimeStamp(Date timeStamp);

  Date getTimeStamp();

  void setStopId(Long StopId);

  Long getStopId();

}
