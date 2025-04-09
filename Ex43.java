/******************************************************************************
Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
*******************************************************************************/
import java.util.Scanner;
public class Ex43
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	  int salario;
	  double salarioAumento, impostos, salarioFinal;
	  
	System.out.print("Insira seu salário atual: ");
	   salario = ler.nextInt();
	  
	  salarioAumento = salario * 1.15;
	  impostos = salarioAumento * 0.08;
	  salarioFinal = salarioAumento - impostos;
	  
	System.out.println("Você entrou com um salário de R$" + salario + ", após os aumentos seu salario ficou R$" + salarioAumento + " e após descontar os impostos, seu salário final será de R$" + salarioFinal);
	
	}
}
