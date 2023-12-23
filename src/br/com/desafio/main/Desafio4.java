package br.com.desafio.main;

import br.com.desafio.model.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Desafio4 {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Honda", "L300", "10", "Flex", 15);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            FileWriter fw = new FileWriter("saida_desafio4.json");
            fw.write(gson.toJson(veiculo1).toString());
            fw.close();
        } catch (IOException msg) {
            System.out.println(msg.getMessage());
        }
    }
}
