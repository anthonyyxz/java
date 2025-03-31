import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do usuário
        System.out.print("Informe o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("Informe o salário do solicitante: ");
        double salario = scanner.nextDouble();

        // Calcular o valor da parcela
        double valorParcela = valorEmprestimo / numeroParcelas;

        // Verificar se o valor da parcela não ultrapassa 30% do salário
        if (valorParcela <= salario * 0.3) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado! O valor da parcela excede 30% do salário.");
        }

        scanner.close();
    }
}
