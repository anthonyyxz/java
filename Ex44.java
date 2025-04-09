/******************************************************************************
Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.
*******************************************************************************/
import java.util.Scanner;
public class Ex44
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 double valorTotal, valorDividido, valorAndreECarlos, valorFelipe;
	 
	System.out.print("Informe o total da conta do bar: ");
	    valorTotal = ler.nextDouble();
	    
	   valorDividido = Math.floor(valorTotal / 3);
	   valorAndreECarlos = valorDividido * 2;
	   
	   valorFelipe = valorTotal - valorAndreECarlos;
	   
	    System.out.println("Carlos deve pagar R$" +  valorDividido);
        System.out.println("André deve pagar R$" +  valorDividido);
        System.out.println("Felipe deve pagar R$" + valorFelipe);
	    
	  
	}
}
