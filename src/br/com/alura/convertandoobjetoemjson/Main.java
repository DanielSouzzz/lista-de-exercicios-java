package br.com.alura.convertandoobjetoemjson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
    String json = "{\"nome\":\"Alice\",\"idade\":30,\"cidade\":\"São Paulo\",\"id\":\"123\"}";

    Gson gson = new GsonBuilder().setLenient().create();
    Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
