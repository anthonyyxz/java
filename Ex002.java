import java.util.Scanner;
public class Ex002 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         
         System.out.println("Informe o primeiro número: ");
         int numero1 = ler.nextInt();
         System.out.println("Informe o segundo número: ");
         int numero2 = ler.nextInt();
         int soma = numero1 + numero2;
         System.out.println("A soma dos valores é: " + soma);
     }
}