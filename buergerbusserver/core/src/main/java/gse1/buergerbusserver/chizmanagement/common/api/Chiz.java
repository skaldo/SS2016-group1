package gse1.buergerbusserver.chizmanagement.common.api;

import gse1.buergerbusserver.general.common.api.ApplicationEntity;

import java.util.Date;

/**
 * @author razadfki
 *
 */
public interface Chiz extends ApplicationEntity {

  void setName(String name);

  String getName();

  void setTimestamp(Date timeStamp);

  Date getTimestamp();


}
