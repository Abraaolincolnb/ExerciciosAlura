package br.com.exercicios.TodoOCursoDeAPIs.Aula1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TheMealDB {
    static void main() throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);

        String pesquisa = input.nextLine().replace(" ", "+");
        String apiLink = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + pesquisa;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiLink))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
