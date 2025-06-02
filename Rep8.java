import java.util.Scanner;
public class Rep8
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int soma = 0;
        double media;
        
        for (int i=0; i <5; i++) {
        System.out.println("Digite a idade da " +(i + 1)+ "° pessoa");
        int idade = scanner.nextInt();
        soma += idade;
        }
         media = soma/5.0;
        
        
        System.out.println("A soma das idades é : "+soma);
        System.out.println("A media das idades é : "+media);

    }
}