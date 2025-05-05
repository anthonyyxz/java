// Exercicio 007
// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que 
// calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;
public class Ex007 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe sua altura: ");
         double altura = ler.nextDouble();
         double pesoIdeal = ( 72.7 * altura ) - 58;
         System.out.println("Seu peso ideal é: " + pesoIdeal);
     }
}