/******************************************************************************
Desenvolver um programa que ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:
*******************************************************************************/
import java.util.Scanner;
public class Ex46
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
    int opcao;
    double areaRetangulo, areaTriangulo, areaCirculo;
    int baseRetangulo = 0, alturaRetangulo = 0;
    int baseTriangulo, alturaTriangulo;
    int raioCirculo; 
    do {
        System.out.println("--- Calculadora de Áreas ---");
            System.out.println("1. Calcular Área do Retângulo");
            System.out.println("2. Calcular Área do Triângulo");
            System.out.println("3. Calcular Área do Círculo");
            System.out.println("0. Sair");
            System.out.print("-- Escolha uma opção: ");
	        opcao = ler.nextInt();
	    
	    switch (opcao) { 
	        case 1:
	            System.out.print("Insira a medida da base do Retângulo: ");
	            baseRetangulo = ler.nextInt();
	            System.out.print("Insira a medida da altura do Retângulo: ");
	            alturaRetangulo = ler.nextInt();
	            areaRetangulo = baseRetangulo * alturaRetangulo;
	            System.out.println("A área do retângulo é de " + areaRetangulo + " m²");
	            break;
	       
	        case 2:  
	            System.out.print("Insira a medida da base do Triângulo: ");
	            baseTriangulo = ler.nextInt();
	            System.out.print("Insira a medida da altura do Triângulo: ");
	            alturaTriangulo = ler.nextInt();
	            areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
	            System.out.println("A área do Triangulo é de " + areaTriangulo + " m²");
	            break;
	        
	        case 3:
	            System.out.print("Insira a medida do raio do Círculo: ");
	            raioCirculo = ler.nextInt();
	            areaCirculo = (raioCirculo * raioCirculo) * 3.14;
	            System.out.println("A área do Círculo é de " + areaCirculo + " m²");
	            break;
	       
	        case 0:
	            System.out.print("Saindo do programa!");
	            break;
	         }
	      } while (opcao != 0);
	}
}
