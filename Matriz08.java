/*****
 
 Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.

*****/
import java.util.Scanner;
public class Matriz08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[5][2];
        int[][] matrizB = new int[5][2];
        int[][] matrizSoma = new int[5][2];

        System.out.println("Digite os elementos da primeira matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 5x2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
