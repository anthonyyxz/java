import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        
        System.out.print("Digite seu nome: ");  
        String nome = ler.nextLine(); 
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome); 
        }
        
    }
}
