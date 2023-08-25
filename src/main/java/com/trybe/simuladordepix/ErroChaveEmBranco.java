package com.trybe.simuladordepix;

/**
 * custom exception para caso no ProcessadorDePix a chave enviada esteja em branco. 
 */
public class ErroChaveEmBranco extends ErroDePix {
  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }
}