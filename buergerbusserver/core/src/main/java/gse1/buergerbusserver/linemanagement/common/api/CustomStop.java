package gse1.buergerbusserver.linemanagement.common.api;

import java.util.Date;
import java.util.List;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

/**
 * @author ricarda42
 *
 */
public interface CustomStop extends ApplicationEntity {

  /**
   * @param lineId
   */
  void setLineId(Long lineId);

  /**
   * @return id of the line requested
   */
  Long getLineId();

  /**
   * @param requestId
   */

  void setRequestId(Long requestId);

  /**
   * @return id of the request
   */
  Long getRequestId();

  /**
   * @param pickUpTime
   */
  void setPickUpTime(Date pickUpTime);

  /**
   * @return time the customer wants to be picked up
   */
  Date getPickUpTime();

  /**
   * @param lon
   */
  void setLon(double lon);

  /**
   * @return longitude of position
   */
  double getLon();

  /**
   * @param lat
   */
  void setLat(double lat);

  /**
   * @return latitude of position
   */
  double getLat();

  /**
   * @param numberOfPersons
   */
  void setNumberOfPersons(int numberOfPersons);

  /**
   * @return number of persons
   */
  int getNumberOfPersons();

  /**
   * @param deviceId
   */
  void setDeviceId(String deviceId);

  /**
   * @return Id of the device which sent the request
   */
  String getDeviceId();

  /**
   * @param userName
   */
  void setUserName(String userName);

  /**
   * @return Name of the customer
   */
  String getUserName();

  /**
   * @param userAddress
   */
  void setUserAddress(String userAddress);

  /**
   * @return address where the customer wants to be picked up
   */
  String getUserAddress();

  /**
   * @param userAssistance
   */
  void setUserAssistance(List<Integer> userAssistance);

  /**
   * @return array of encoded assistance requirements
   */
  List<Integer> getUserAssistance();

  /**
   * @param status
   */
  void setStatus(int status);

  /**
   * @return status of request encoded in numbers
   */
  int getStatus();

  /**
   * @param busId
   */
  void setBusId(Long busId);

  /**
   * @return Id of bus serving this request
   */
  Long getBusId();

  /**
   * @param timeStamp
   */
  void setTimeStamp(Date timeStamp);

  /**
   * @return timestamp of data
   */
  Date getTimeStamp();

}