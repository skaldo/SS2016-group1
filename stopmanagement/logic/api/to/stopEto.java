package gse1.buergerbusserver.stopmanagement.logic.api.to;

import java.sql.Timestamp;
import java.util.Date;

import gse1.buergerbusserver.stopmanagement.common.api.stop;
import io.oasp.module.basic.common.api.to.AbstractEto;

/**
 * @author JAYU
 *
 */
public class stopEto extends AbstractEto implements stop {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String name;

  @SuppressWarnings("unused")
  private Long LineId;

  private Date timeStamp;

  private String gpsdata;

  private Long Id;

  private Long StopId;

  @Override
  public void setId(Long Id) {

    this.Id = this.Id;

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
  public Long getLines(Long LineId) {

    return LineId;

  }

  @Override
  public String getSchedule() {

    // TODO Auto-generated method stub
    return null;
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
