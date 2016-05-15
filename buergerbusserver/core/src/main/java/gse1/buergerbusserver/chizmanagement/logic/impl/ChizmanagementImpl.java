package gse1.buergerbusserver.chizmanagement.logic.impl;

import gse1.buergerbusserver.general.logic.base.AbstractComponentFacade;
import gse1.buergerbusserver.chizmanagement.dataaccess.api.dao.ChizDao;
import gse1.buergerbusserver.chizmanagement.logic.api.Chizmanagement;
import gse1.buergerbusserver.chizmanagement.logic.api.to.ChizEto;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Named
@Component
@Transactional
public class ChizmanagementImpl extends AbstractComponentFacade implements Chizmanagement {

  @Inject
  private ChizDao chizDao;

  @Override
  public List<ChizEto> listAllChizs() {

    return getBeanMapper().mapList(this.chizDao.findAll(), ChizEto.class);
  }


}
