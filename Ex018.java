import java.util.Scanner;

public class Ex018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números inteiros no intervalo entre " + num1 + " e " + num2 + ":");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }
    }
}
