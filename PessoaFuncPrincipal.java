public class PessoaFuncPrincipal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "123.456.789-00", 2500.0);
        funcionario.exibirInfo();

        funcionario.aumentarSalario(10);
        funcionario.exibirInfo();
    }
}
