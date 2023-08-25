package com.trybe.simuladordepix;

/**
 * Erro customizado para caso chave não seja encontrada. 
 */
public class ErroChaveNaoEncontrada extends ErroDePix {
  public ErroChaveNaoEncontrada() {
    super(Mensagens.CHAVE_NAO_ENCONTRADA);
  }
}