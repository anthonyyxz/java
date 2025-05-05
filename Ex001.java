import java.util.Scanner;
public class Ex001 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         
         System.out.println("Informe um número: ");
         int numero = ler.nextInt();
         System.out.println("O número informado foi: " + numero);
     }
}