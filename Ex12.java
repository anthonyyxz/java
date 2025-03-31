import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        // Definir o ano atual
        int anoAtual = java.time.Year.now().getValue();

        // Calcular a idade
        int idade = anoAtual - anoNascimento;

        // Verificar a situação em relação ao alistamento
        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.printf("Você tem %d anos. Faltam %d anos para o alistamento.%n", idade, anosFaltantes);
        } else if (idade == 18) {
            System.out.println("Você tem 18 anos. Está na idade de se alistar!");
        } else {
            int anosPassados = idade - 18;
            System.out.printf("Você tem %d anos. Já se passaram %d anos desde o alistamento.%n", idade, anosPassados);
        }

        scanner.close();
    }
}
