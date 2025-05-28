/******************************************************************************

Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.

*******************************************************************************/
import java.util.Scanner;
public class Matriz04
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int contagemPares = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    contagemPares++;
                }
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Quantidade de números pares na matriz: " + contagemPares);
	}
}
