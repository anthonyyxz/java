/*******************************************************************
 
Exercicio 008
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que 
João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

***********************************************************************/

import java.util.Scanner;
public class Ex008 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe o peso de peixes: ");
         double pesoPeixe = ler.nextDouble();
         if (pesoPeixe > 50) {
             double excesso = pesoPeixe - 50;
             double multa = excesso * 4.00;
             System.out.println("O peso excedeu " + excesso + "kg do limite permitido! A multa será: R$" + multa);
         }
         else {
             System.out.println("O peso está dentro do limite permitido, não haverá multa!");
         }
     }
}