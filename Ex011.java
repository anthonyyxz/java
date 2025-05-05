/*******************************************************************
 
Exercicio 011
Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

***********************************************************************/

import java.util.Scanner;
public class Ex011 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Insira um número: ");
         double numero = ler.nextDouble();
         
         if (numero > 0) {
             System.out.println("O número é positivo");
            } else {
                 System.out.println("O número é negativo");
             }
         }
     }