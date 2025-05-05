/************

 * Exercicio 019
O Departamento Estadual de Meteorologia lhe contratou 
para desenvolver um programa que leia as um conjunto 
indeterminado de temperaturas, e informe ao final 
a menor e a maior temperaturas informadas, bem como a média das temperaturas.

***************/
import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        double menorTemperatura = Double.MAX_VALUE;
        double maiorTemperatura = Double.MIN_VALUE;
        double somaTemperaturas = 0;
        int contador = 0;
        
        System.out.println("Digite as temperaturas (digite -1 para encerrar):");
        while (true) {
            temperatura = scanner.nextDouble();

            if (temperatura == -1) {
                break;
            }
             if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }

           
            somaTemperaturas += temperatura;
            contador++;
        }

        
        if (contador > 0) {
            double mediaTemperaturas = somaTemperaturas / contador;
            System.out.println("Menor temperatura: " + menorTemperatura);
            System.out.println("Maior temperatura: " + maiorTemperatura);
            System.out.println("Média das temperaturas: " + mediaTemperaturas);
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}
