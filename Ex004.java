// Exercicio 004
// Faça um Programa que converta metros para centímetros.
import java.util.Scanner;
public class Ex004 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe quantos metros: ");
         int metro = ler.nextInt();
         int centimetros = metro * 100;
         System.out.println("Convertendo para centímetros ficaria: " + centimetros);
     }
}