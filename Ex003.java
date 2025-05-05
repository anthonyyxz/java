import java.util.Scanner;
public class Ex003 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         int soma = 0;
         for  (int i = 1; i <= 4; i++) {
             System.out.println("Informe a nota:");
             int notas = ler.nextInt();
             soma += notas;
         }
         double media = soma / 4;
         System.out.println("A média das notas será: " + media);
     }
}