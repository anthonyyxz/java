import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario, bonus4, bonus5, fim4, fim5;
        int tempo;

        System.out.print("Qual o seu salario: ");
        salario = ler.nextDouble(); 

        System.out.print("Esta a quanto tempo na empresa?: ");
        tempo = ler.nextInt(); 

        bonus5 = salario * 0.20;
        fim5 = salario + bonus5;
        bonus4 = salario * 0.10;
        fim4 = salario + bonus4;

        if (tempo >= 5) {
            System.out.println("Seu bonus será de: " + bonus5);
            System.out.println("Seu salário com a bonificação será de: " + fim5);
        } else {
            System.out.println("Seu bonus será de: " + bonus4);
            System.out.println("Seu salário com a bonificação será de: " + fim4);
        }

    }
}
