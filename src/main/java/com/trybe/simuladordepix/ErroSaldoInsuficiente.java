package com.trybe.simuladordepix;

/**
 * custom exception- para caso no ProcessadorDePix a chave enviada esteja em branco.  
 */
public class ErroSaldoInsuficiente extends ErroDePix {
  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }
}