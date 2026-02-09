package br.com.exercicios.TodoOCursoDeAPIs.Aula3.ex03;

import br.com.exercicios.TodoOCursoDeAPIs.Aula3.ex02.SenhaInvalidaExeption;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//    "message": "Not Found",
//    "documentation_url": "https://docs.github.com/rest",
//    "status": "404"

public class Main {
    static void main() throws IOException, InterruptedException {
        while(true) {
            try {
                Scanner Scanner = new Scanner(System.in);

                System.out.println("Digite o nome de usuário que deseja procurar: ");
                String nomeDeUsuario = Scanner.nextLine();

                String endereco = "https://api.github.com/users/" + nomeDeUsuario;

                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 404) {
                    throw new ErroConsultaGitHubException(nomeDeUsuario + " Não encontrado, Tente novamente!");
                }else {
                    System.out.println(response.body());
                }
            }
            catch (IOException | InterruptedException e) {
                System.out.println("deu um erro ai na consulta, mo role pra escrever qual q foi");
                e.printStackTrace(System.out);
            }
            catch (ErroConsultaGitHubException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
    }
}