package br.com.proway.exemplos.orientacao.objetos.telas;

public class Pessoa {

    private String nome;
    private String cpf;
    private boolean possuiPet;
    private String signo;
    private double renda;

    // https://bit.ly/3RxLONE
    // Sobrecarga: overload (capacidade de ter métodos com o mesmo nome, 
    // porém com parâmetros adicionais. O objetivo é o mesmo porém adicionando comportamento
    // Construtor: tem como objetivo construir o objeto com as informações que são
    // necessárias para o correto funcionamento do objeto
    public Pessoa(String nome, double renda, String cpf, String signo, boolean possuiPet) {
        this.nome = nome;
        this.renda = renda;
        this.cpf = cpf;
        this.signo = signo;
        this.possuiPet = possuiPet;
    }

    // Construtor
    public Pessoa(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }

    // Construtor vazio, permitindo o programador instanciar sem a necessidade de parâmetros
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isPossuiPet() {
        return possuiPet;
    }

    public void setPossuiPet(boolean possuiPet) {
        this.possuiPet = possuiPet;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

}
