/*******************************************************************
 
Exercicio 013
Faça um Programa que leia três números e mostre o maior deles.

***********************************************************************/

import java.util.Scanner;
public class Ex013 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Insira o primeiro numero: ");
         int n1 = ler.nextInt();
         System.out.println("Insira o segundo numero: ");
         int n2 = ler.nextInt();
         System.out.println("Insira o tereiro numero: ");
         int n3 = ler.nextInt();
         
         
         if (n1 > n2 && n1 > n3) {
             System.out.println("O maior número é: " + n1);
             } else if (n2 > n1 && n2 > n3) {
             System.out.println("O maior número é: " + n2);
                 } else {
                     System.out.println("O maior número é: " + n3);
                 }
     }
}