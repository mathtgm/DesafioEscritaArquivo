package br.com.desafio.main;

import br.com.desafio.model.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Desafio2 {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Matrix", "120", 2010);
        Gson gson = new GsonBuilder().create();

        try {
            FileWriter fw = new FileWriter("saida_desafio2.json");
            fw.write(gson.toJson(titulo1).toString());
            fw.close();
        } catch (IOException msg) {
            System.out.println(msg.getMessage());
        }

    }
}
