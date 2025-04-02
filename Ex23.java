import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade;
        double peso;
        double somaPesoFaixa1 = 0, somaPesoFaixa2 = 0, somaPesoFaixa3 = 0, somaPesoFaixa4 = 0, mediaPesoFaixa1, mediaPesoFaixa2, mediaPesoFaixa3, mediaPesoFaixa4;
        int contFaixa1 = 0, contFaixa2 = 0, contFaixa3 = 0, contFaixa4 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            idade = ler.nextInt();
            
            System.out.print("Digite o peso (em kg): ");
            peso = ler.nextDouble();
            
            if (idade >= 1 && idade <= 10) {
                somaPesoFaixa1 += peso;
                contFaixa1++;
            } else if (idade >= 11 && idade <= 20) {
                somaPesoFaixa2 += peso;
                contFaixa2++;
            } else if (idade >= 21 && idade <= 30) {
                somaPesoFaixa3 += peso;
                contFaixa3++;
            } else if (idade > 31) {
                somaPesoFaixa4 += peso;
                contFaixa4++;
            }
        }

    
     mediaPesoFaixa1 = contFaixa1 > 0 ? somaPesoFaixa1 / contFaixa1 : 0;
       mediaPesoFaixa2 = contFaixa2 > 0 ? somaPesoFaixa2 / contFaixa2 : 0;
         mediaPesoFaixa3 = contFaixa3 > 0 ? somaPesoFaixa3 / contFaixa3 : 0;
           mediaPesoFaixa4 = contFaixa4 > 0 ? somaPesoFaixa4 / contFaixa4 : 0;

       
        System.out.printf("Média de peso da faixa etária de 1 a 10 anos: %.2f kg\n", mediaPesoFaixa1);
        System.out.printf("Média de peso da faixa etária de 11 a 20 anos: %.2f kg\n", mediaPesoFaixa2);
        System.out.printf("Média de peso da faixa etária de 21 a 30 anos: %.2f kg\n", mediaPesoFaixa3);
        System.out.printf("Média de peso da faixa etária acima de 31 anos: %.2f kg\n", mediaPesoFaixa4);
    }
}