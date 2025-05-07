import java.util.Arrays;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];

        
        System.out.println("Informe 10 valores reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        
        double[] valoresCrescentes = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valoresCrescentes);
        System.out.println("Valores em ordem crescente: " + Arrays.toString(valoresCrescentes));

        
        double[] valoresDecrescentes = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valoresDecrescentes);
        System.out.println("Valores em ordem decrescente: ");
        for (int i = valoresDecrescentes.length - 1; i >= 0; i--) {
            System.out.print(valoresDecrescentes[i] + " ");
        }
        System.out.println();

        System.out.println("Valores na ordem inversa da entrada:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
    }
}