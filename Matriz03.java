import java.util.Scanner;
public class Matriz03{
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        matriz[0][0] = 5;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
        matriz[0][3] = 2;
        matriz[0][4] = 4;

        matriz[1][0] = 4;
        matriz[1][1] = 3;
        matriz[1][2] = 6;
        matriz[1][3] = 2;
        matriz[1][4] = 4;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 1;
        matriz[2][3] = 2;
        matriz[2][4] = 4;

        matriz[3][0] = 7;
        matriz[3][1] = 8;
        matriz[3][2] = 1;
        matriz[3][3] = 8;
        matriz[3][4] = 4;

        matriz[4][0] = 7;
        matriz[4][1] = 8;
        matriz[4][2] = 8;
        matriz[4][3] = 2;
        matriz[4][4] = 0;

        System.out.println("MATRIZ 5X5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int[] repetidos = new int[25];
        int repetidosCount = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int valorAtual = matriz[i][j];
                boolean encontrado = false;

                for (int k = 0; k < repetidosCount; k++) {
                    if (repetidos[k] == valorAtual) {
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    int ocorrencias = 0;
                    for (int x = 0; x < 5; x++) {
                        for (int y = 0; y < 5; y++) {
                            if (matriz[x][y] == valorAtual) {
                                ocorrencias++;
                            }
                        }
                    }

                    if (ocorrencias > 1) {
                        repetidos[repetidosCount] = valorAtual;
                        repetidosCount++;
                    }
                }
            }
        }

        if (repetidosCount == 0) {
            System.out.println("\nNão há números repetidos na matriz.");
        } else {
            System.out.print("\nNúmeros repetidos: ");
            for (int i = 0; i < repetidosCount; i++) {
                System.out.print(repetidos[i] + " ");
            }
            System.out.println();
        }
    }
}
