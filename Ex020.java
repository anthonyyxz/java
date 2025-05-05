/************

Exercicio 020
Faça um programa que peça 10 números inteiros, 
calcule e mostre a quantidade de números pares e a
quantidade de números impares.

***************/
import java.util.Scanner;

public class Ex020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

    }
}