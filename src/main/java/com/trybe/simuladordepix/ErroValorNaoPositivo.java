package com.trybe.simuladordepix;

/**
 * custom exception- para caso no ProcessadorDePix a chave enviada esteja em branco.  
 */
public class ErroValorNaoPositivo extends ErroDePix {
  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }
}