package Metodos;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        int numero = Lernumero();
        VericarNumero(numero);

    }

    public static int Lernumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva um numero multiplo de 5: ");
        return scanner.nextInt();
    }

    public static void VericarNumero(int numero){

        int multiplo = 5;

        if (numero % multiplo == 0) {
            System.out.println(numero + " é multiplo de 5.");
        } else {
            System.out.println(numero + " não é multiplo de 5.");
        }
    }
}

