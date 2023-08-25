package com.trybe.simuladordepix;

/**
 * utilizado para enviar para o processador de pix no Principal e é o utilizado nesse projeto.
 */
public class ServidorFake implements Servidor {

  @Override
  public Conexao abrirConexao() {
    return new Conexao() {

      @Override
      public void close() {
      }

      @Override
      public String enviarPix(int valor, String chave) {
        return CodigosDeRetorno.SUCESSO;
      }
    };
  }
}
