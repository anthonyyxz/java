/*******************************************************************
 

Exercicio 015
Faça um Programa que leia um número e exiba o di
a correspondente da semana. (1-Domingo, 2- Segunda, etc.), 
se digitar outro valor deve aparecer valor inválido.

***********************************************************************/

import java.util.Scanner;
public class Ex015 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         int dia;
        System.out.println("informe o dia da semana: ");
        dia = ler.nextInt();
        if ( dia == 1){
            System.out.println("hoje é domingo");
        } if ( dia == 2){
            System.out.println("hoje é segunda");
        } if ( dia == 3){
            System.out.println("hoje é terça");
        } if ( dia == 4){
            System.out.println("hoje é quarta");
        } if ( dia == 5){
            System.out.println("hoje é quinta");
        } if ( dia == 6){
            System.out.println("hoje é sexta");
        } if ( dia == 7){
            System.out.println("hoje é sabado");
        } if ( dia > 7 ){
            System.out.println("valor invalido");
        }
}
}
