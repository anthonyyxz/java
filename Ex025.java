import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5, 6};
        System.out.println("Vetor original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 
        int[] numerosInvertidos = new int[numeros.length];

        
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length - 1 - i];
        }

       
        System.out.println("Vetor invertido:");
        for (int i = 0; i < numerosInvertidos.length; i++) {
            System.out.print(numerosInvertidos[i] + " ");
        }
        System.out.println(); 
    }
}