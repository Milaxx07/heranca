package aplicacao;

import modelo.Pessoa;
import modelo.Fornecedor;

public class MainFornecedor {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Camila", "Rua A, 123", "99999-8888");
        Fornecedor f1 = new Fornecedor("Fornecedor X", "Av. Central, 456", "98888-7777", 10000.0, 4500.0);

        System.out.println("Pessoa -> Nome: " + p1.getNome() + ", Endereço: " + p1.getEndereco() + ", Telefone: " + p1.getTelefone());

        System.out.println("Fornecedor -> Nome: " + f1.getNome() + ", Endereço: " + f1.getEndereco() + ", Telefone: " + f1.getTelefone());
        System.out.println("Crédito: " + f1.getValorCredito() + ", Dívida: " + f1.getValorDivida());
        System.out.println("Saldo disponível: " + f1.obterSaldo());
    }
}
