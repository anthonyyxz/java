import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int ano_de_nasc, idade;
        Scanner ler = new Scanner(System.in);  
        
        System.out.print("Digite o ano em que você nasceu: ");
        ano_de_nasc = ler.nextInt();
        
        idade = 2025 - ano_de_nasc;
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        
        ler.close(); 
    }
}
