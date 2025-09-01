package animal;

public class Leao01 extends Animal {

    public Leao(String nome, String sexo, String raca) {
        super(nome, sexo, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão está rugindo.");
    }
}
