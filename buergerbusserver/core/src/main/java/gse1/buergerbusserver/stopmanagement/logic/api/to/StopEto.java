package gse1.buergerbusserver.stopmanagement.logic.api.to;

import java.sql.Timestamp;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
public class StopEto {

  private String name;

  private String routeObjectReference;

  private double lat;
  
  private Timestamp timeStamp;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return timeStamp
   */
  public Timestamp getTimeStamp() {

    return this.timeStamp;
  }

  /**
   * @param timeStamp new value of {@link #gettimeStamp}.
   */
  public void setTimeStamp(Timestamp timeStamp) {

    this.timeStamp = timeStamp;
  }

  public double getLat(){
	  return this.lat;
  }
  public void setLat(double lat){
	  this.lat = lat;
  }
}
