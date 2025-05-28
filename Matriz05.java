/*****
 
Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.

*****/
import java.util.Scanner;

public class Matriz05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somaColunas = new int[3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                somaColunas[j] += matriz[i][j]; 
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Soma dos valores de cada coluna:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }

    }
}