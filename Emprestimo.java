import java.util.Scanner;

public class Emprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();

            System.out.print("Digite o número de parcelas: ");
            int numParcelas = scanner.nextInt();

            while (valorEmprestimo <= 0 || numParcelas <= 0) {
                System.out.println("Erro: O valor do empréstimo e o número de parcelas devem ser positivos.");
                System.out.print("Digite o valor do empréstimo: R$ ");
                valorEmprestimo = scanner.nextDouble();

                System.out.print("Digite o número de parcelas: ");
                numParcelas = scanner.nextInt();
            }

            double taxaJuros = 0.02;

            double montanteFinal = valorEmprestimo * Math.pow(1 + taxaJuros, numParcelas);

            double parcela = montanteFinal / numParcelas;

            System.out.println("\nValor final do empréstimo: R$ " + String.format("%.2f", montanteFinal));
            System.out.println("Valor de cada parcela: R$ " + String.format("%.2f", parcela));

            System.out.print("\nDeseja simular outro empréstimo? (S/N): ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}