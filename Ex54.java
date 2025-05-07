import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe a quantidade de valores inteiros (N): ");
        int n = scanner.nextInt();

        int[] valores = new int[n]; 
        int contadorPares = 0; 
        int produtoImpares = 1;
        boolean temImpar = false;

        
        System.out.println("Informe " + n + " valores inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

           
            if (valores[i] % 2 == 0) {
                contadorPares++;
            } else {
                produtoImpares *= valores[i]; 
                temImpar = true; 
            }
        }

        
        System.out.println("Quantidade de valores pares: " + contadorPares);
        if (temImpar) {
            System.out.println("Produto dos valores ímpares: " + produtoImpares);
        } else {
            System.out.println("Não há valores ímpares para multiplicar.");
        }
    }
}