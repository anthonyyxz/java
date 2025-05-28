/*****
 
 Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.

*****/
import java.util.Scanner;

public class Matriz06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[6][3];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite os elementos da matriz 6x3:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Maior elemento na matriz: " + maior);
        System.out.println("Menor elemento na matriz: " + menor);

    }
}
