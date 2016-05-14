package gse1.buergerbusserver.stopmanagement.logic.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.stopmanagement.dataaccess.api.dao.stopEntity;
import gse1.buergerbusserver.stopmanagement.logic.api.to.stopEto;

/**
 * @author JAYU
 *
 */
@Named
@Component
@Transactional
public class stopmanagementImpl extends AbstractComponentFacade implements stopmanagement {

  @Inject
  private stopDao stopDao;

  @Override
  public List<stopEto> listAllstops()

  {

    return getBeanMapper().mapList(this.stopDao.listAllstops(), stopEto.class);
  }

  @Override
  public List<stopEto> getAllstops() {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<stopEto> findstopsOnLine(Long LineId) {

    List<stopEntity> stops = this.stopDao.getstopsOnLine(LineId);
    return getBeanMapper().mapList(stops, stopEto.class);
  }

}