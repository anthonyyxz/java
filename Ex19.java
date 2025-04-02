import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomeMaisNovo = "", nome;
        int idadeMaisNova = Integer.MAX_VALUE, idade;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            nome = ler.nextLine(); 

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            idade = ler.nextInt();
            ler.nextLine();

          
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade; 
                nomeMaisNovo = nome; 
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
    }
}