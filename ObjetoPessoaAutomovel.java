package modificadores;

import java.util.Scanner;
public class ObjetoPessoaAutomovel {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        String cor,nome;
        int velocidade;

        System.out.println("Informe a cor do carro: ");
         cor = ler.next();
        System.out.println("Informe o nome do carro:");
         nome = ler.next();
        System.out.println("Informe a velocidade do carro: ");
         velocidade = ler.nextInt();

         pessoa.compracarro(cor, nome, velocidade);

         Automovel carro = pessoa.getAutomovel();

         System.out.println("O carro comprado foi "+ carro.getNome() + " da cor " + carro.getCor() + " que atinge a velocidade de " + carro.getVelocidade() + " Km/h");

    }
}
