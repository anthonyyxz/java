import java.util.Scanner;

public class CadastroNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int totalNotas = 0;
        int countExcelente = 0;
        int countBom = 0;
        int countRegular = 0;
        int countInsuficiente = 0;

        System.out.println("=== Sistema de Cadastro de Notas ===");
        System.out.println("Digite as notas (de 0 a 10). Digite -1 para encerrar.");

        while (true) {
            System.out.print("Digite a nota: ");
            double nota = scanner.nextDouble();
            
            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }

            somaNotas += nota;
            totalNotas++;

            if (nota >= 9) {
                countExcelente++;
                System.out.println("Classificação: Excelente");
            } else if (nota >= 7) {
                countBom++;
                System.out.println("Classificação: Bom");
            } else if (nota >= 5) {
                countRegular++;
                System.out.println("Classificação: Regular");
            } else {
                countInsuficiente++;
                System.out.println("Classificação: Insuficiente");
            }
        }

        if (totalNotas > 0) {
            double media = somaNotas / totalNotas;
            System.out.println("\n=== Resultado Final ===");
            System.out.println("Média geral das notas: " + media);
            System.out.println("Total de 'Excelente': " + countExcelente);
            System.out.println("Total de 'Bom': " + countBom);
            System.out.println("Total de 'Regular': " + countRegular);
            System.out.println("Total de 'Insuficiente': " + countInsuficiente);
        } else {
            System.out.println("Nenhuma nota foi cadastrada.");
        }

    }
}