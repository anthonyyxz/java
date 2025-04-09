/******************************************************************************
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.
*******************************************************************************/
import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	 double litrosGasolina, valorPago;
	System.out.println("Quanto você deseja colocar em seu tanque ( em reais)");
	   valorPago = ler.nextInt();
	 
	 litrosGasolina = valorPago / 6.31;
	 
    System.out.println("No total deu " + litrosGasolina + " Litros de gasolina, obrigado por nos escolher!");
	
	}
}
