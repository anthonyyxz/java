package empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Jornada(1, "Ana", "11999999999", 101, "Rua A", 3000.0);
        Funcionario f2 = new Horista(2, "Bruno", "11888888888", 102, "Rua B", 25.0, 160);
        Funcionario f3 = new PessoaJuridica(3, "Empresa XYZ", "11777777777", 103, "Rua C", 10000.0);

        f1.calculaSalario();
        f2.calculaSalario();
        f3.calculaSalario();
    }
}

