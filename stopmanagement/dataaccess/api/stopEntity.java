package gse1.buergerbusserver.stopmanagement.dataaccess.api;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.stopmanagement.common.api.stop;

/**
 * @author JAYU
 *
 */
@Entity
@Table(name = "stop")
public class stopEntity extends ApplicationPersistenceEntity implements stop {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private Long id;

  private String name;

  private String gpsdata;

  private Long LineId;

  private Date timeStamp;

  private Long StopId;

  @Override
  public void setId(Long Id) {

    this.id = this.id;

  }

  @Override
  public String getSchedule() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setName(String name) {

    this.name = name;

  }

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setLines(Long LineId) {

    this.LineId = LineId;

  }

  @Override
  public Long getLines(Long Id) {

    return Id;

  }

  @Override
  public void setSchedule(String LineId, Date Time) {

    // TODO Auto-generated method stub

  }

  @Override
  public void setLocation(String gpsdata) {

    this.gpsdata = gpsdata;

  }

  @Override
  public String getLocation() {

    return this.gpsdata;
  }

  @Override
  public void setTimeStamp(Timestamp timeStamp) {

    this.timeStamp = timeStamp;

  }

  @Override
  public Timestamp getTimeStamp() {

    return (Timestamp) this.timeStamp;
  }

  @Override
  public void setArivingTime(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  @Override
  public Date getArivingTime() {

    return this.timeStamp;
  }

  @Override
  public void setStopId(Long StopId) {

    this.StopId = StopId;

  }

  @Override
  public Long getStopId() {

    return this.StopId;
  }

}