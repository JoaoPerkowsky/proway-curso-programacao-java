package br.com.proway.exemplos.orientacao.objetos.heranca;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class PrincipalHeranca {

    public static void main(String[] args) {

        Colaborador jose = new Colaborador();
        jose.setCpf("123.456.789-12");
        jose.setDataNascimento(LocalDate.of(2004, 9, 18));
        jose.setEndereco("Rua das palmeiras amarelas, 301");
        jose.setId(1);
        jose.setNome("José");
        jose.setTipoConta("Conta Poupança");
        jose.setNumeroAgencia((short) 1234);
        jose.setNumeroConta(1234918);

        Fornecedor maria = new Fornecedor();
        maria.setCnpj("50.120.114/0001-43");
        maria.setDataFundacao(LocalDate.of(2018, 1, 20));
        maria.setId(2);
        maria.setNome("Maria");
        maria.setTipoConta("Conta Corrente");
        maria.setNumeroConta(1234919);
        maria.setNumeroAgencia((short) 1235);

        Terceiro joao = new Terceiro();
        joao.setCpf("608.016.430-23");
        joao.setQuantidadeHoras(1);
        joao.setValorHora(1_000_000);
        joao.setId(3);
        joao.setNome("João");
        joao.setTipoConta("Conta Corrente");
        joao.setNumeroConta(1234920);
        joao.setNumeroAgencia((short) 1235);

        JOptionPane.showMessageDialog(null,
                "Nome: " + jose.getNome()
                + "\nCódigo: " + jose.getId()
                + "\nTipo conta: " + jose.getTipoConta()
                + "\nNúmero conta: " + jose.getNumeroConta()
                + "\nNúmero agencia: " + jose.getNumeroAgencia()
                + "\nCPF: " + jose.getCpf()
                + "\nData Nascimento: " + jose.getDataNascimento()
                + "\nEndereço: " + jose.getEndereco());

        JOptionPane.showMessageDialog(null,
                "Nome: " + maria.getNome()
                + "\nCódigo: " + maria.getId()
                + "\nTipo conta: " + maria.getTipoConta()
                + "\nNúmero conta: " + maria.getNumeroConta()
                + "\nNúmero agencia: " + maria.getNumeroAgencia()
                + "\nCNPJ: " + maria.getCnpj()
                + "\nData fundação: " + maria.getDataFundacao());

        JOptionPane.showMessageDialog(null,
                "Nome: " + joao.getNome()
                + "\nCódigo: " + joao.getId()
                + "\nTipo conta: " + joao.getTipoConta()
                + "\nNúmero conta: " + joao.getNumeroConta()
                + "\nNúmero agencia: " + joao.getNumeroAgencia()
                + "\nCPF: " + joao.getCpf()
                + "\nValor hora: " + joao.getValorHora()
                + "\nQuantidade de horas: " + joao.getQuantidadeHoras());
    }
}
