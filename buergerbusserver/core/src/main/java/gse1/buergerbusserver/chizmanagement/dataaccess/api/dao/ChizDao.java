package gse1.buergerbusserver.chizmanagement.dataaccess.api.dao;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.chizmanagement.dataaccess.api.ChizEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author razadfki
 *
 */
public interface ChizDao extends ApplicationDao<ChizEntity>, MasterDataDao<ChizEntity> {

}
