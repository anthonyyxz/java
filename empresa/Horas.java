package empresa;

public class Horas extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public Horista(long id, String nome, String telefone, int matricula, String endereco, double valorHora, int horasTrabalhadas) {
        super(id, nome, telefone, matricula, endereco);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calculaSalario() {
        double salario = valorHora * horasTrabalhadas;
        System.out.println("Salário por hora: R$ " + salario);
    }
}
