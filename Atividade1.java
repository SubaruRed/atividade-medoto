package Metodos;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        int numero = lerNumero(); //Lê o número
        verificarEImprimirSePar(numero); //Verifica e imprime se é par ou não
    }

    //ler o número do usuário
    public static int lerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        return scanner.nextInt(); // Retorna o número digitado pelo usuário
    }

    //verificar se o número é par e imprimir o resultado
    public static void verificarEImprimirSePar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " É um número par.");
        } else {
            System.out.println(numero + " Não é um número par.");
        }
    }
}
