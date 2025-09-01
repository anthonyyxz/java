package empresa;

public class PessoaJuridica extends Funcionario {
    private double valorContrato;

    public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco, double valorContrato) {
        super(id, nome, telefone, matricula, endereco);
        this.valorContrato = valorContrato;
    }

    @Override
    public void calculaSalario() {
        System.out.println("Valor do contrato: R$ " + valorContrato);
    }
}

