package gse1.buergerbusserver.chizmanagement.service.impl.rest;

import gse1.buergerbusserver.chizmanagement.logic.api.Chizmanagement;
import gse1.buergerbusserver.chizmanagement.logic.api.to.ChizEto;
import gse1.buergerbusserver.chizmanagement.service.api.rest.ChizmanagementRestService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * TODO mbrunnli This type ...
 *
 * @author mbrunnli
 * @since 0.1
 */
@Named("ChizmanagementRestService")
public class ChizmanagementRestServiceImpl implements ChizmanagementRestService {

  @Inject
  private Chizmanagement chizmanagement;

  @Override
  public List<ChizEto> listAllChizs() {

    return this.chizmanagement.listAllChizs();
  }
}

