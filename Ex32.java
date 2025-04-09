/******************************************************************************
Faça um programa que leia 5 números e informe o maior número.
*******************************************************************************/
import java.util.Scanner;
public class Ex32
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE, numero = 0;
		int i = 0;
		
	while (i < 5){
	    i++;
	    System.out.println("Insira o " + i + " número");
	    numero = ler.nextInt();
	
	if (numero > maiorNumero){
	    maiorNumero = numero;
	}
	}
	System.out.println("O maior número é " + maiorNumero);

	}
}
