import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Salário base do funcionário
        final double salario_base = 1200.00;

        // Solicita o total vendido no mês
        System.out.print("Digite o total vendido pelo funcionário no mês de abril: ");
        double totalVendido = scanner.nextDouble();

        double comissao = 0;

        // Calcula a comissão se o total vendido for maior que R$2.000,00
        if (totalVendido > 2000) {
            comissao = totalVendido * 0.10;
        }

        // Calcula o salário bruto
        double salarioBruto = salario_base + comissao;

        // Exibe a comissão e o salário bruto
        System.out.println("Comissão: R$" + comissao);
        System.out.println("Salário bruto: R$" + salarioBruto);

        scanner.close();
    }
}
