/************

Exercicio 020
Faça um programa que peça 10 números inteiros, 
calcule e mostre a quantidade de números pares e a
quantidade de números impares.

***************/
import java.util.Scanner;

public class Ex021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Valores do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}