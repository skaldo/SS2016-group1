package gse1.buergerbusserver.stopmanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.util.Date;

/**
 * @author mbaniasad
 *
 */
public interface Stop extends ApplicationEntity {

  void setName(String name);

  String getName();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();


}
