package br.com.exercicios.TodoOCursoDeAPIs.Aula1;

import java.util.Scanner;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GoogleBooks {
    static void main() throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String ApiKEY = "AIzaSyAwvjdETCoLSKQTKOLLi0fxB09IuaQbh10";
        String Pesquisa = scanner.nextLine();
        String LinkDaRequest = "https://www.googleapis.com/books/v1/volumes?q=" + Pesquisa + ":keyes&key="  + ApiKEY;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(LinkDaRequest))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



    }
}
