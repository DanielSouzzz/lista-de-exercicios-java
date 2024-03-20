package br.com.alura.github;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        var username = input.next();

        String endpoint = "https://api.github.com/users/" + username;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .header("Authorization", "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")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            int status = response.statusCode();
            if (status == 200) {
                System.out.println("status: " + status + " OK");
            } else if (status == 404){
                throw new ErroConsultaGitHubException(" status 404 Usuário não encontrado");
            }

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e){
            System.out.println("Opss.. houve um erro durante a consulta");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
