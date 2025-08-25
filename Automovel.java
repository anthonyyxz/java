import javax.swing.plaf.IconUIResource;

public class Automovel {
    private int velocidade;
    private String cor;
    private String nome;

    public void compracarro (String cor, String nome, int velocidade) /
    Automovel = new Automovel();
    Automovel.setCor(cor);
    Automovel.setNome(nome);
    Automovel.setVelocidade(velocidade):

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
