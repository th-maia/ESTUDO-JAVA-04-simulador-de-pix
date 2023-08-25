package com.trybe.simuladordepix;

/**
 *  custom exception para caso de erro dela extenderá as 
 *  ErroInterno, ErroChaveEmBranco, ErroChaveNaoEncontrada, ErroSaldoInsuficinete,
 *  ErroValorNaoPositivo. 
 */
public abstract class ErroDePix extends Exception {
  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
