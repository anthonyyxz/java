/*******************************************************************

Exercicio 017
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

***********************************************************************/

import java.util.Scanner;
public class Ex017 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);;
         int numero = -1;
         System.out.println("Números ímpares entre 1 e 50: ");
         while (numero <= 50) {
             if (numero % 2 == 1) {
                 System.out.println(numero);
             }
             numero++;
         }
     }
  }
    