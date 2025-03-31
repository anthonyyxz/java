import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o saldo médio do cliente
        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        double credito = 0;

        // Calcular o valor do crédito com base no saldo médio
        if (saldoMedio >= 0 && saldoMedio <= 200) {
            credito = 0; // Nenhum crédito
        } else if (saldoMedio > 200 && saldoMedio <= 400) {
            credito = saldoMedio * 0.2; // 20% do saldo médio
        } else if (saldoMedio > 400 && saldoMedio <= 600) {
            credito = saldoMedio * 0.3; // 30% do saldo médio
        } else if (saldoMedio > 600) {
            credito = saldoMedio * 0.4; // 40% do saldo médio
        }

        // Exibir o saldo médio e o valor do crédito
        System.out.printf("Saldo médio: R$ %.2f%n", saldoMedio);
        System.out.printf("Valor do crédito: R$ %.2f%n", credito);

        scanner.close();
    }
}
