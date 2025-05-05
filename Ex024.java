import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 12, 7, 5, 3, 8, 5, 10}; 

        System.out.print("Digite um número para contar quantas vezes ele aparece no vetor: ");
        int numeroParaContar = scanner.nextInt();

        int contador = 0;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroParaContar) {
                contador++;
            }
        }
        System.out.println("O número " + numeroParaContar + " aparece " + contador + " vez(es) no vetor.");
    }
}