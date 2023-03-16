package br.com.alura.servidor;

import java.io.IOException;
import java.net.ServerSocket;

public class ServidorTarefas {
    public static void main(String[] args) throws IOException {

        System.out.println("--- Iniciando servidor ---");

        final var servidor = new ServerSocket(12345);

        while(true) {
            final var socket = servidor.accept();
            System.out.println("Aceitando novo cliente na porta " + socket.getPort() + "!");
        }

    }
}