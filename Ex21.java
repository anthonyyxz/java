import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 

        int pessoasComIdadeSuperior50ePesoInferior60 = 0;
        int totalIdadesComAlturaInferior150 = 0;
        int countIdadesComAlturaInferior150 = 0;
        int pessoasComOlhosAzuis = 0;
        int pessoasRuivasSemOlhosAzuis = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Idade: ");
            int idade = ler.nextInt();

            System.out.print("Peso (em kg): ");
            double peso = ler.nextDouble();

            System.out.print("Altura (em metros): ");
            double altura = ler.nextDouble();

            System.out.print("Cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            char corOlhos = ler.next().toUpperCase().charAt(0);

            System.out.print("Cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
            char corCabelos = ler.next().toUpperCase().charAt(0);  

            if (idade > 50 && peso < 60) {
                pessoasComIdadeSuperior50ePesoInferior60++;
            }

            if (altura < 1.50) {
                totalIdadesComAlturaInferior150 += idade;
                countIdadesComAlturaInferior150++;
            }

            if (corOlhos == 'A') {
                pessoasComOlhosAzuis++;
            }

            if (corCabelos == 'R' && corOlhos != 'A') {
                pessoasRuivasSemOlhosAzuis++;
            }
        }

        double mediaIdadesComAlturaInferior150 = 0;
        if (countIdadesComAlturaInferior150 > 0) {
            mediaIdadesComAlturaInferior150 = (double) totalIdadesComAlturaInferior150 / countIdadesComAlturaInferior150;
        }

        double porcentagemOlhosAzuis = (pessoasComOlhosAzuis / 20.0) * 100;

        System.out.println("\nQuantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + pessoasComIdadeSuperior50ePesoInferior60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 metros: " + mediaIdadesComAlturaInferior150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + pessoasRuivasSemOlhosAzuis);

    }
}
