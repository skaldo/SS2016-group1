package gse1.buergerbusserver.stopmanagement.dataaccess.api.impl.dao;

import java.util.List;

import com.mysema.query.alias.Alias;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.EntityPathBase;

import gse1.buergerbusserver.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.stopDao;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.stopEntity;

/**
 * @author JAYU
 *
 */
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

    stopEntity stop = Alias.alias(stopEntity.class);
    EntityPathBase<stopEntity> alias = Alias.$(stop);
    JPAQuery query = new JPAQuery(getEntityManager()).from(alias);

    query.where(Alias.$(stop.getStopId()).eq(stopId));

    return query.list(alias);

  }

  @Override
  protected Class<stopEntity> getEntityClass() {

    return stopEntity.class;

  }

}
