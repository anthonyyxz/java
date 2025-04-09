/******************************************************************************
Faça um programa que leia 10 números e informe a soma e a média dos números.
*******************************************************************************/
import java.util.Scanner;
public class Ex33
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	 int i = 0;
	 int numero;
	 double media, soma = 0;
	 while (i < 10){
	     i++;
	     System.out.println("Insira o " + i + " número");
	        numero = ler.nextInt();
	        soma += numero;}
	 media = soma / 10 ;         
	     System.out.println("A média dos números é " + media); 
   }
}
