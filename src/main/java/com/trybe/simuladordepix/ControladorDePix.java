package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * é o componente que contém a lógica de apresentação deste fluxo.
 * Ele é responsável por invocar o processador de Pix, passando as informações dadas pela usuário
 * na tela do aplicativo. Também é responsabilidade do componente capturar qualquer erro
 * durante o processo e informar a pessoa usuária sobre o resultado da operação.
 */
public class ControladorDePix {

  private final ProcessadorDePix processadorDePix;

  public ControladorDePix(ProcessadorDePix processadorDePix) {
    this.processadorDePix = processadorDePix;
  }

  /**
   * Método a ser executado no momento em que a pessoa usuária confirmar
   * a operação de Pix.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @return Mensagem a ser exibida à pessoa usuária, informando-a sobre
   *         o resultado da operação.
   */
  public String aoConfirmarPix(int valor, String chave) {
    // TODO: Implementar.
    try {
      this.processadorDePix.executarPix(valor, chave);
      return Mensagens.SUCESSO;
    } catch (ErroChaveEmBranco e) {
      return Mensagens.CHAVE_EM_BRANCO;
    } catch (ErroValorNaoPositivo e) {
      return Mensagens.VALOR_NAO_POSITIVO;
    } catch (ErroSaldoInsuficiente e) {
      return Mensagens.SALDO_INSUFICIENTE;
    } catch (IOException e) {
      return Mensagens.ERRO_DE_CONEXAO;
    } catch (ErroChaveNaoEncontrada e) {
      return Mensagens.CHAVE_NAO_ENCONTRADA;
    } catch (ErroInterno e) {
      return Mensagens.ERRO_INTERNO;
    } catch (ErroDePix ignored) {
      return "";
    }
  }
}
