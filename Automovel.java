public class Automovel extends Veiculo {
    private int numeroPortas;
    private String motor;

    public Automovel(String marca, String modelo, int ano, String cor, int numeroPortas, String motor) {
        super(marca, modelo, ano, cor);
        this.numeroPortas = numeroPortas;
        this.motor = motor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Motor: " + motor);
    }
}

