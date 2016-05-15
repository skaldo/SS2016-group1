package gse1.buergerbusserver.chizmanagement.dataaccess.api.impl.dao;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.chizmanagement.dataaccess.api.ChizEntity;
import gse1.buergerbusserver.chizmanagement.dataaccess.api.dao.ChizDao;

import javax.inject.Named;

/**
 * @author razadfki
 *
 */
@Named
public class ChizDaoImpl extends ApplicationMasterDataDaoImpl<ChizEntity> implements ChizDao {

  @Override
  protected Class<ChizEntity> getEntityClass() {

    return ChizEntity.class;
  }

  // for more see https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#queries
  // AND
  // https://github.com/oasp-forge/oasp4j-wiki/wiki/guide-dataaccess-layer#dynamic-queries

}

