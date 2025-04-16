import java.util.Scanner;
import java.lang.Math;

public class Delta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;

        System.out.println("O valor de Δ (delta) é: " + delta);

        if (delta > 0) {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raízes reais e distintas são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x1 = -B / (2 * A);

            System.out.println("A raiz real é: " + x1);
        } else {
            System.out.println("Não existem raízes reais. As raízes são complexas.");
        }

    }
}