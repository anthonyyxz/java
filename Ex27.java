/******************************************************************************
Faça um programa, utilizando while, que permita o usuário escrever o nome de cinco pessoas e os mostre na tela.
*******************************************************************************/
import java.util.Scanner;
public class Ex27
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
		String[] nomes = new String[5];
		while (i < 5){
		    System.out.println("Insira o " + (i + 1) + " nome");
		    nomes[i] = ler.nextLine();
		    i ++;}
		    System.out.println("As pessoas são:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
	}
}
