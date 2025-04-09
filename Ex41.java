/******************************************************************************
O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
*******************************************************************************/
import java.util.Scanner;
public class Ex41
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 int peso;
	 double valorPrato;
	 
	System.out.print("Insira o valor em kgs do seu prato de comida: ");
	     peso = ler.nextInt();
	 
	 valorPrato = peso * 12;
	 
	System.out.println("O valor a ser pago pelo seu prato será " + valorPrato + " Reais");
	}
}
