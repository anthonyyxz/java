import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c100 = 100; 
        int c50 = 50;  
        int c20 = 20;   
        int c10 = 10;   
        int c5 = 5;

        System.out.print("Digite o valor do saque: R$ ");
        int saque = scanner.nextInt();

        if (saque % 5 != 0) {
            System.out.println("Erro: O valor do saque deve ser múltiplo de 5.");
            return;
        }

        int num100 = 0, num50 = 0, num20 = 0, num10 = 0, num5 = 0;

        while (saque > 0) {
            if (saque >= c100) {
                num100 = saque / c100;
                saque = saque % c100;
            } else if (saque >= c50) {
                num50 = saque / c50;
                saque = saque % c50;
            } else if (saque >= c20) {
                num20 = saque / c20;
                saque = saque % c20;
            } else if (saque >= c10) {
                num10 = saque / c10;
                saque = saque % c10;
            } else if (saque >= c5) {
                num5 = saque / c5;
                saque = saque % c5;
            }
        }

        if (saque == 0) {
            System.out.println("\nSaque realizado com sucesso!");
            if (num100 > 0) System.out.println("Cédulas de R$100: " + num100);
            if (num50 > 0) System.out.println("Cédulas de R$50: " + num50);
            if (num20 > 0) System.out.println("Cédulas de R$20: " + num20);
            if (num10 > 0) System.out.println("Cédulas de R$10: " + num10);
            if (num5 > 0) System.out.println("Cédulas de R$5: " + num5);
        } else {
            System.out.println("Erro: Não é possível realizar o saque com as cédulas disponíveis.");
        }

        scanner.close();
    }
}
