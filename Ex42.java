/******************************************************************************
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.
*******************************************************************************/
import java.util.Scanner;
public class Ex42
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	 int qntdCamisaPequena, qntdCamisaMedia, qntdCamisaGrande;
	 double valorCamisaPequena, valorCamisaMedia, valorCamisaGrande, valorArrecadado;
	 
	System.out.println("Quantas camisetas seram pequenas?");
	    qntdCamisaPequena = ler.nextInt();
	System.out.println("E quantas camisetas seram medias?");
	    qntdCamisaMedia = ler.nextInt();
	System.out.println("E quantas camisetas seram grandes?");
	    qntdCamisaGrande = ler.nextInt();
	 
	 valorCamisaPequena = qntdCamisaPequena * 10;
	 valorCamisaMedia = qntdCamisaMedia * 12;
	 valorCamisaGrande = qntdCamisaGrande * 15;
	 valorArrecadado = valorCamisaPequena + valorCamisaMedia + valorCamisaGrande;
	
	System.out.println("O valor das camisetas pequenas será R$" + valorCamisaPequena + ", já o valor das camisetas medias será R$" + valorCamisaMedia + " e por fim, o valor das camisetas grandes será R$" + valorCamisaGrande);
	System.out.println("O valor total arrecadado é de R$" + valorArrecadado);
	    
	}
	
}
