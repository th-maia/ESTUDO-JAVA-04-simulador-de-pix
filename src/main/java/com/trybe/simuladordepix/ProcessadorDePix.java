package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * é o componente que contém a lógica de negócio da operação.
 * Dadas as entradas (valor e chave Pix), o processador de Pix será responsável por 
 * validá-las e enviá-las ao servidor na nuvem, interpretando a resposta recebida.
 * O processador de Pix interage com outros dois componentes que você não vai precisar programar:
 * o Servidor e a Conexao
 * O processador de Pix vai usar uma conexão para enviar os dados de entrada (valor e chave Pix).
 */
public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio
   * sem envolver as interações do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação
   *                     entre o aplicativo e o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    // TODO: Implementar.
    if (valor <= 0) {
      throw new ErroValorNaoPositivo();
    }
    if (chave.trim().isEmpty()) {
      throw new ErroChaveEmBranco();
    }

    Conexao servidor = this.servidor.abrirConexao();

    try (servidor) {
      String mensagem = servidor.enviarPix(valor, chave);
      System.out.print(mensagem);
      if (mensagem == CodigosDeRetorno.SALDO_INSUFICIENTE) {
        throw new ErroSaldoInsuficiente();
      } else if (mensagem == CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA) {
        throw new ErroChaveNaoEncontrada();
      } else if (mensagem != CodigosDeRetorno.SUCESSO) {
        throw new ErroInterno();
      }
    }
  }
}
