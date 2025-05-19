/******************************************************************************

Faça um programa que leia uma matriz [5,5]de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.

*******************************************************************************/
import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nA matriz tem " + matriz.length + " linhas e " + matriz[0].length + " colunas.");

        System.out.println("\nMatriz formatada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
