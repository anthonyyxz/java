/*******************************************************************
 
Exercicio 010
Faça um Programa que peça dois números e imprima o maior deles.

***********************************************************************/

import java.util.Scanner;
public class Ex010 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Insira um número: ");
         int numero1 = ler.nextInt();
         System.out.println("Insira outro número: ");
         int numero2 = ler.nextInt();
         
         if (numero1 > numero2) {
             System.out.println("O maior número é: " + numero1);
            } else {
                 System.out.println("O maior número é: " + numero2);
             }
         }
     }