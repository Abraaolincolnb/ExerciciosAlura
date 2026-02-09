package br.com.exercicios.TodoOCursoDeAPIs.Aula2;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Vicitu\",\"idade\":21,\"cidade\":\"Recife\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);

    }
}
