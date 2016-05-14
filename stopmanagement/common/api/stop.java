package gse1.buergerbusserver.stopmanagement.common.api;

import java.sql.Timestamp;
import java.util.Date;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author JAYU
 *
 */

public interface stop extends ApplicationEntity {

  @Override
  void setId(Long id);

  @Override
  Long getId();

  void setName(String name);

  String getName();

  void setLines(Long Id);

  Long getLines(Long Id);

  void setSchedule(String LineId, Date Time);

  String getSchedule();

  void setLocation(String gpsdata);

  String getLocation();

  void setTimeStamp(Timestamp timeStamp);

  Timestamp getTimeStamp();

  void setArivingTime(Date timeStamp);

  Date getArivingTime();

  void setStopId(Long StopId);

  Long getStopId();

}
