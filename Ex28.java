/******************************************************************************
Faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser.
*******************************************************************************/
import java.util.Scanner;
public class Ex28
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numeroUm, numeroDois, soma;
		String continuar = "s" ;
	
		while (continuar.equals("s") || continuar.equals("S")){
    		System.out.print("Insira o primeiro número: ");
    		numeroUm = ler.nextDouble();
    		System.out.print("Insira o segundo número: ");
    		numeroDois = ler.nextDouble();
    		soma = numeroUm + numeroDois;
    		System.out.println("A soma dos números é " + soma);
    		ler.nextLine();
    		System.out.println("Deseja continuar? (s/n)");
    		continuar = ler.nextLine();
		    
		}
        
		 System.out.println("Obrigado por usar o programa de adição!");
		
	}
}
