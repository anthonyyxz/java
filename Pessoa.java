import java.util.Scanner
public class Pessoa {
    String nome;
    int idade;
    String profissao;

    public static void main(String[] args)

    Scanner ler = new Scanner (System.in);

    Pessoa pessoa = new Pessoa ();

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
