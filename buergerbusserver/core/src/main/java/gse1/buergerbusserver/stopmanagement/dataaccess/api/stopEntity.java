package gse1.buergerbusserver.stopmanagement.dataaccess.api;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gse1.buergerbusserver.general.dataaccess.api.ApplicationPersistenceEntity;
import gse1.buergerbusserver.stopmanagement.common.api.stop;

/**
 * @author JAYU
 *
 */

/*
 * @Entity
 *
 * @Table(name = "STOP")
 */

public class stopEntity extends ApplicationPersistenceEntity implements stop {

  private static final long serialVersionUID = 1L;

  private Long id;

  private String name;

  private String gpsdata;

  private Long LineId;

  private Date timeStamp;

  private Long StopId;

  @Override
  public void setId(Long Id) {

    this.id = Id;

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

  public void setTimeStamp(Date timeStamp) {

    this.timeStamp = timeStamp;

  }

  @Override
  @Temporal(TemporalType.TIMESTAMP)
  public Date getTimeStamp() {

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