/******************************************************************************
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia.
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, 
o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), 
e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
*******************************************************************************/
import java.util.Scanner;
public class Ex38
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int qntdPao, qntdBroas;
    double valorBroa, valorPao, valorFinal, poupança;
    
    System.out.println("Quantos pães foram vendidos?");
      qntdPao = ler.nextInt();
    System.out.println("Quantas broas foram vendidas?");
      qntdBroas = ler.nextInt();
      
    valorPao = qntdPao * 0.12;
    valorBroa = qntdBroas * 1.50;
    valorFinal = valorBroa + valorPao;
    poupança = valorFinal * 0.10;
    
    System.out.print("O valor total das vendas de pães e broas no dia foi de " + valorFinal + " reais, o valor que deverá ser guardado na poupança é de " + poupança + " reais ");
	}
}
