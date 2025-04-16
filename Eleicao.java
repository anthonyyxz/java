import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        int voto = -1;

        System.out.println("Simulação de Eleição");
        System.out.println("Digite 1 para votar no Candidato 1");
        System.out.println("Digite 2 para votar no Candidato 2");
        System.out.println("Digite 3 para votar no Candidato 3");
        System.out.println("Digite 0 para encerrar a votação");

        while (voto != 0) {
            System.out.print("Digite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else if (voto == 0) {
                System.out.println("Votação encerrada.");
            } else {
                System.out.println("Voto inválido! Tente novamente.");
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Candidato 1 é o vencedor!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("Candidato 2 é o vencedor!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("Candidato 3 é o vencedor!");
        } else {
            System.out.println("Houve um empate entre os candidatos!");
        }

        scanner.close();
    }
}
