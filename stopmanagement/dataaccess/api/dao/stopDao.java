package gse1.buergerbusserver.stopmanagement.dataaccess.api.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author JAYU
 *
 */
public interface stopDao extends ApplicationDao<stopEntity>, MasterDataDao<stopEntity> {
  /**
   * @return
   */
  @SuppressWarnings("javadoc")
  List<stopEntity> getAvailablestops();

  @SuppressWarnings("javadoc")
  List<stopEntity> getstopsOnLine(Long LineId);
}
