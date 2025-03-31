import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner ler = new Scanner(System.in);  

        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();  
        
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();  
        
        System.out.println("Digite o terceiro número: ");
        n3 = ler.nextInt();  
        
        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é " + n1);  
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é " + n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é " + n3);
        }


    }
}
