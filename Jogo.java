import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumero = 0;

        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        int escolha = scanner.nextInt();

        if (escolha == 1) maxNumero = 10;
        else if (escolha == 2) maxNumero = 50;
        else if (escolha == 3) maxNumero = 100;
        else {
            System.out.println("Escolha inválida.");
            return;
        }

        int numeroSecreto = random.nextInt(maxNumero) + 1;
        int tentativas = 5;

        System.out.println("Adivinhe o número de 1 a " + maxNumero + ". Você tem 5 tentativas.");

        while (tentativas > 0) {
            System.out.print("Tentativa: ");
            int chute = scanner.nextInt();

            if (chute == numeroSecreto) {
                System.out.println("Acertou! Parabéns!");
                break;
            } else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println("Errou! O número era " + numeroSecreto);
                } else {
                    System.out.println(chute < numeroSecreto ? "Tente um número MAIOR." : "Tente um número MENOR.");
                    System.out.println("Tentativas restantes: " + tentativas);
                }
            }
        }

        scanner.close();
    }
}
