import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, maioresDeIdade= 0, soma = 0;
        double media;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade " + i + ": ");
            idade = ler.nextInt();  
            
            soma += idade;
            
            if(idade > 18)
          maioresDeIdade++;
        }
        
        media = soma / 20.0;  
        
        System.out.println("A soma das idades dessas 20 pessoas é: " + soma);
        System.out.println("A média das idades é: " + media);
        System.out.println("Numero de pessoas maior de idade: "+ maioresDeIdade);
    }
}
