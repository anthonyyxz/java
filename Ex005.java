// Exercicio 005
// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;
public class Ex005 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe o quanto você ganha por hora: ");
         int quantoHora = ler.nextInt();
         System.out.println("Informe quantas horas você trabalha no mês: ");
         int horaMes = ler.nextInt();
         int salario = quantoHora * horaMes;
         System.out.println("O seu salário será:  " + salario);
         
     }
}