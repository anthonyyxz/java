/******************************************************************************
Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.
*******************************************************************************/
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        do {
       
            System.out.println("\nMenu:");
            System.out.println("1 - Depósito bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) { 
                System.out.print("Digite o valor do depósito: R$ ");
                double valorDeposito = scanner.nextDouble();
                if (valorDeposito > 0) {
                    saldo += valorDeposito;
                    System.out.println("Depósito de R$ " + valorDeposito + " realizado com sucesso.");
                } else {
                    System.out.println("Valor de depósito inválido.");
                }
            } else if (opcao == 2) { 
                System.out.print("Digite o valor do saque: R$ ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque > 0 && valorSaque <= saldo) {
                    saldo -= valorSaque;
                    System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso.");
                } else if (valorSaque > saldo) {
                    System.out.println("Saldo insuficiente para saque.");
                } else {
                    System.out.println("Valor de saque inválido.");
                }
            } else if (opcao == 3) { 
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
            } else if (opcao == 4) { 
                System.out.println("Saindo do sistema. Até logo!");
            } else { 
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4); 
    }
}