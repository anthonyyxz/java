import java.util.Scanner;

public class Matriz02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4]; 

        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz Original:");
        imprimirMatriz(matriz);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("\nMatriz Modificada:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
