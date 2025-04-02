import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade, somaIdades = 0, somaIdadesMulheres = 0, somaIdadesHomens = 0;
        int contMulheres = 0, contHomens = 0;
        double mediaIdadeGrupo, mediaIdadeMulheres, mediaIdadeHomens;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            idade = ler.nextInt();
            ler.nextLine(); 
            
            System.out.print("Digite o sexo (M - Masculino, F - Feminino): ");
            char sexo = ler.nextLine().toUpperCase().charAt(0);
      
            somaIdades += idade;
            
            if (sexo == 'F') {
                somaIdadesMulheres += idade;
                contMulheres++;
            } else if (sexo == 'M') {
                somaIdadesHomens += idade;
                contHomens++;
            }
        }

  
        mediaIdadeGrupo = (double) somaIdades / 7;
        mediaIdadeMulheres = contMulheres > 0 ? (double) somaIdadesMulheres / contMulheres : 0;
        mediaIdadeHomens = contHomens > 0 ? (double) somaIdadesHomens / contHomens : 0;

        System.out.printf("A idade média do grupo é: ", mediaIdadeGrupo);
        System.out.printf("A idade média das mulheres é: ", mediaIdadeMulheres);
        System.out.printf("A idade média dos homens é: ", mediaIdadeHomens);
    }
}