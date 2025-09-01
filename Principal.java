package Heranca;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João da Silva", "(11) 9999-9999");
        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());

        PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11) 9999-9999","123.456.789-00","300.456.989-X");
        System.out.println("\nPessoa física:");
        System.out.println("Nome: " + pessoaFisica.getNome());
        System.out.println("Telefone: " + pessoaFisica.getTelefone());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("RG: " + pessoaFisica.getRg());

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(11) 9999-9999","12.345.678/9001-23");
        System.out.println("\nPessoa jurídica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("Telefone: " + pessoaJuridica.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
    }
}