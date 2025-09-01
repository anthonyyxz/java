package empresa;

public class Jornada extends Funcionario {
    private double salarioMensal;

    public Jornada(long id, String nome, String telefone, int matricula, String endereco, double salarioMensal) {
        super(id, nome, telefone, matricula, endereco);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void calculaSalario() {
        System.out.println("Salário mensal: R$ " + salarioMensal);
    }
}