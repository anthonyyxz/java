import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preços dos combustíveis
        final double PRECO_GASOLINA = 1.80;
        final double PRECO_ALCOOL = 1.00;

        // Solicitar o tipo de carro e a capacidade do tanque
        System.out.print("Informe o tipo de carro (G para gasolina, A para álcool): ");
        char tipoCarro = scanner.next().charAt(0);

        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidadeTanque = scanner.nextDouble();

        double valorGasto = 0;

        // Calcular o valor gasto com base no tipo de combustível
        if (tipoCarro == 'G' || tipoCarro == 'g') {
            valorGasto = capacidadeTanque * PRECO_GASOLINA;
            System.out.printf("O custo para encher o tanque com gasolina é: R$ %.2f%n", valorGasto);
        } else if (tipoCarro == 'A' || tipoCarro == 'a') {
            valorGasto = capacidadeTanque * PRECO_ALCOOL;
            System.out.printf("O custo para encher o tanque com álcool é: R$ %.2f%n", valorGasto);
        } else {
            System.out.println("Tipo de carro inválido. Use 'G' para gasolina ou 'A' para álcool.");
        }

        scanner.close();
    }
}
