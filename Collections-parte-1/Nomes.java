package br.uft.edu.uft2023.Collections.Tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        lerNome();
    }

    private static void lerNome() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por , sem espaços:");

        String resposta = s.next();
        String[] nomes = resposta.split(",");
        List<String> lista = new ArrayList<>();

        for (String nome : nomes) {
            lista.add(nome);
        }

        Collections.sort(lista);
        System.out.println(lista);
    }
}
