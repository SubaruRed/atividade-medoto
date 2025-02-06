package Metodos;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int numero = Lernumero();
        Verificarnumero(numero);
    }

    public static int Lernumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um numero: ");
        return scanner.nextInt();
    }

    public static void Verificarnumero(int numero){

        if (numero > 0) {
            System.out.println(numero + " É um numero positivo");
        } else if (numero < 0)  {
            System.out.println(numero + " É um numero negativo");
        } else {
            System.out.println(numero + " É igual a zero.");
        }
    }
}

