package com.trybe.simuladordepix;

/**
 *  custom exception para caso de erro interno. 
 */
public class ErroInterno extends ErroDePix {
  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }
}