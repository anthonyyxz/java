import java.util.Scanner;

public class ConstrutorPessoa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa jogador1 = new Pessoa();
        Pessoa jogador2 = new Pessoa("Cristiano Ronaldo", 40);
        Pessoa jogador3 = new Pessoa("Messi");

        System.out.println(jogador2.getNome());
        System.out.println(jogador2.getIdade());

        System.out.println(jogador3.getNome());
        System.out.println(jogador3.getIdade());

    }
}
