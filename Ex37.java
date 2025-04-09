/******************************************************************************
Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.
*******************************************************************************/
import java.util.Scanner;
public class Ex37
{
	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 int cavalos;
	 double ferraduras;
	 System.out.println("Quantos cavalos foram comprados para o haras?");
	     cavalos = ler.nextInt();
	  ferraduras = cavalos * 4;
	 
	 System.out.print("Seram necessárias " + ferraduras + " ferraduras");
	}
}
