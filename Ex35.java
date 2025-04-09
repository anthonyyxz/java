/******************************************************************************
Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos 
 * comprados e o valor a ser pago.
*******************************************************************************/
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomesProdutos = new String[10];
        double[] valoresProdutos = new double[10];
        double valorTotal = 0;
        int i = 0;

        do {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomesProdutos[i] = scanner.nextLine();
            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            valoresProdutos[i] = scanner.nextDouble();
            scanner.nextLine(); 
            valorTotal += valoresProdutos[i];
            i++;
        } while (i < 10);

    
        System.out.println("\nProdutos comprados:");
        for (int j = 0; j < 10; j++) {
            System.out.println(nomesProdutos[j] + " - R$ " + valoresProdutos[j]);
        }

      
        System.out.println("\nEscolha a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (3% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (sem juros)");
        System.out.println("4 - Parcelado no cartão em três vezes ou até 10 parcelas (10% de juros)");
        
        int opcao = scanner.nextInt();
        double valorAPagar = 0;

      if (opcao == 1){
                valorAPagar = valorTotal * 0.92;
                System.out.printf("O valor total a ser pago é: " + valorAPagar);}
        else if (opcao == 2){
                valorAPagar = valorTotal * 0.97;} 
                else if (opcao == 3){
                valorAPagar = valorTotal;} 
                else if(opcao == 4){
                valorAPagar = valorTotal * 1.10; }
                else{
                System.out.println("Opção inválida!");}
        

    }
}