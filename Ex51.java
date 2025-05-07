import java.util.Random;
public class Ex51
{
	public static void main(String[] args) {
		Random random = new Random();
		int[] numeros = new int[10];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		
		for (int i = 0; i < 10; i++) {
		    numeros[i] = random.nextInt(101);
		    soma = numeros[i];
		    
		      if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
		    double media = soma / 10.0;
		    
		     System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.printf("%nO maior número é: %d%n", maior);
        System.out.printf("O menor número é: %d%n", menor);
        System.out.printf("A média é: %.2f%n", media);
        
	}
}