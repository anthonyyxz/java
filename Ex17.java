import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = ler.nextInt();  
            
            soma += numero;  
        }
        
        System.out.println("A soma dos 10 números é: " + soma);
    }
}
