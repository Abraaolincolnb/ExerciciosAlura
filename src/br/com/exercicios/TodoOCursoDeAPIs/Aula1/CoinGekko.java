package br.com.exercicios.TodoOCursoDeAPIs.Aula1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGekko {
    // CG-7SuKCgADPyc8NqqTAkejSP38
    static void main() throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String Moeda = scanner.nextLine();
        String LinkResquest = "https://api.coingecko.com/api/v3/simple/price?ids=" + Moeda + "&vs_currencies=usd&x_cg_api_key=CG-7SuKCgADPyc8NqqTAkejSP38";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(LinkResquest))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
