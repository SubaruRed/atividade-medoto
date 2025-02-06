package Metodos;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int ano = LerAno();
        VerificarAno(ano);
    }

    public static int LerAno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        return scanner.nextInt();

    }

    public static void VerificarAno(int ano){

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println(ano + " É um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}

