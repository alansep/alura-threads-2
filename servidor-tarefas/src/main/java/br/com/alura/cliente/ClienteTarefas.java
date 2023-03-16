package br.com.alura.cliente;

import java.io.IOException;
import java.net.Socket;

public class ClienteTarefas {

    public static void main(String[] args) throws IOException {

        final var socket = new Socket("127.0.0.1", 12345);

        System.out.println("Conexão estabelecida");


        socket.close();
    }

}
