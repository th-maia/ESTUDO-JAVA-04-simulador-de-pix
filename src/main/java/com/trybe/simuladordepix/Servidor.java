package com.trybe.simuladordepix;

import java.io.IOException;

/**
 * Servidor: é o componente que será utilizado pelo processador de Pix para 
 * abrir uma nova Conexão com o servidor na nuvem.OBS:Nesse projeto usa o ServidorFake.
 */
public interface Servidor {

  Conexao abrirConexao() throws IOException;
}
