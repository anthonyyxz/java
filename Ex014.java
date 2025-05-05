/*******************************************************************
 
Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa 
que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.

***********************************************************************/

import java.util.Scanner;
public class Ex014 {
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe o seu atual salário: ");
         double salarioInicial = ler.nextDouble();
         double porcentagemAumento;
         
         if (salarioInicial <= 280) {
             porcentagemAumento = 20.0;
            } else if (salarioInicial <= 700) {
                 porcentagemAumento = 15;
             } else if (salarioInicial <= 1500) {
                 porcentagemAumento = 10;
             }  else {
                 porcentagemAumento = 5;
             }
             
        double valorAumento = salarioInicial * (porcentagemAumento / 100);
        double salarioFinal = salarioInicial + valorAumento;
        
        System.out.println("\nSalário antes do reajuste: " + salarioInicial);
        System.out.println("O percentual de aumento aplicado: " + porcentagemAumento);
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("O novo salário: " + salarioFinal);
         }
     }
