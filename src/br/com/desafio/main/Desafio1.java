package br.com.desafio.main;

import java.io.FileWriter;
import java.io.IOException;

public class Desafio1 {
    public static void main(String[] args) {

        try {
        FileWriter fw = new FileWriter("saida_desafio1.txt");
        fw.write("Conteúdo a ser gravado no arquivo.");
        fw.close();
        } catch (IOException msg) {
            System.out.println(msg.getMessage());
        }
    }
}
