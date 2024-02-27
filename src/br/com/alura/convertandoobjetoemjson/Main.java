package br.com.alura.convertandoobjetoemjson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
    String json = "{\"nome\":\"Alice\",\"idade\":30,\"cidade\":\"São Paulo\"}";

    Gson gson = new Gson();
    Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println("Nome: " + pessoa.nome());
        System.out.println("Idade: " + pessoa.idade());
        System.out.println("Cidade: " + pessoa.cidade());
    }
}
