package br.com.proway.exemplos.orientacao.objetos.heranca;

import java.time.LocalDate;

// Fornecedor tem uma herança da classe Parceiro,
// ou seja, herda os atributos públicos e protected, 
// assim como, os métodos públicos e protected.
public class Fornecedor extends Parceiro {

    private String cnpj;
    private LocalDate dataFundacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

}
