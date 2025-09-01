package animal;

public class Lobo01 extends Animal {

    public Lobo(String nome, String sexo, String raca) {
        super(nome, sexo, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("O lobo está uivando.");
    }
}
