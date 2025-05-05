/*******************************************************************
 

Exercicio 016
Faça um Programa que peça um número inteiro 
e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).

***********************************************************************/

import java.util.Scanner;
public class Ex016 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Digite um número inteiro: ");
         int numero = ler.nextInt();
         
         if (numero % 2 == 0) {
             System.out.println("Esse número é par!");
         } else {
             System.out.println("Esse número é ímpar!");
         }
     }
}
