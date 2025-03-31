import java.util.Scanner;// ler as entradas do teclado

public class ex1
{
    public static void main (String[] args) {
        double nota1, nota2, media;
        Scanner ler = new Scanner(System.in);
        { 
            System.out.print("digite sua primeira nota: ");
            nota1 = ler.nextDouble();
            System.out.print("digite sua segunda nota: ");
            nota2 = ler.nextDouble();
            
            media = (nota1 + nota2) / 2.0;
            System.out.println("sua média é " + media);
            
            if (media >= 7)
            System.out.println("vôce foi aprovado");
            else
            System.out.println("você foi reprovado");
        }
    }
}