import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar altura e sexo
        System.out.print("Informe a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Informe o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;

        // Calcular peso ideal com base no sexo
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("O peso ideal para um homem com altura %.2f m é: %.2f kg%n", altura, pesoIdeal);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("O peso ideal para uma mulher com altura %.2f m é: %.2f kg%n", altura, pesoIdeal);
        } else {
            System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
        }

        scanner.close();
    }
}
