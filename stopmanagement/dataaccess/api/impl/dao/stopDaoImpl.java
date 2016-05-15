package gse1.buergerbusserver.stopmanagement.dataaccess.api.impl.dao;

import java.util.List;

import javax.inject.Named;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.stopDao;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.stopEntity;

/**
 * @author JAYU
 *
 */
@Named
public class stopDaoImpl extends ApplicationMasterDataDaoImpl<stopEntity> implements stopDao {

  @SuppressWarnings("javadoc")
  public stopDaoImpl() {

    super();

  }

  @Override
  public List<stopEntity> getAvailablestops() {

    return null;

  }

  @Override
  public List<stopEntity> getstopsOnLine(Long stopId) {

    return null;
  }

  @Override
  protected Class<stopEntity> getEntityClass() {

    return stopEntity.class;

  }

}
