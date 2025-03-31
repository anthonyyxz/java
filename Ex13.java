import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar as dimensões do terreno
        System.out.print("Digite a largura do terreno (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento do terreno (em metros): ");
        double comprimento = scanner.nextDouble();

        // Calcular a área do terreno
        double area = largura * comprimento;

        // Exibir a área do terreno
        System.out.printf("A área do terreno é: %.2f m²%n", area);

        // Classificar o terreno com base na área
        if (area < 50) {
            System.out.println("Classificação: Terreno pequeno");
        } else if (area >= 50 && area <= 100) {
            System.out.println("Classificação: Terreno médio");
        } else {
            System.out.println("Classificação: Terreno grande");
        }

        scanner.close();
    }
}
