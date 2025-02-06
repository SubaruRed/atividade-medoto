package Metodos;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        int idade = Leridade();
        vericarMaiorIdade(idade);
    }

    public static int Leridade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva sua idade: ");
        return scanner.nextInt();

    }


        public static void vericarMaiorIdade(int idade){


        if (idade >= 18) {
            System.out.println(idade + " é maior de idade.");
        } else {
            System.out.println(idade + " Não é maior de idade.");
        }
    }
}
