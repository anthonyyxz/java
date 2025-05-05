/*******************************************************************
 
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

***********************************************************************/

import java.util.Scanner;
public class Ex009 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         double coberturaTinta = 3.0;
         double litroLata = 18.0;
         double precoLata = 80.0;
         
         System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
         double area = ler.nextDouble();
         double litrosNecessarios = area / coberturaTinta;
         int latasNecessarias = (int) (litrosNecessarios / litroLata);
         
          if (litrosNecessarios % litroLata > 0) {
            latasNecessarias++;
        }
        double precoTotal = latasNecessarias * precoLata;
        System.out.println("Latas necessárias: " + latasNecessarias);
        System.out.println("Preço total: " + precoTotal);
     }
}