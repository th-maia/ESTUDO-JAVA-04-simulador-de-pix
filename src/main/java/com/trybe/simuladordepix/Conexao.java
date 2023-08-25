package com.trybe.simuladordepix;

import java.io.Closeable;
import java.io.IOException;

/**
 *  Conexao: representa um canal de comunicação entre o aplicativo mobile e o servidor na nuvem.
 */
public interface Conexao extends Closeable {
  String enviarPix(int valor, String chave) throws IOException;
}
