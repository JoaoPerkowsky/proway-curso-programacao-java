package br.com.proway.exemplos.orientacao.objetos.heranca;

// Classe pai
public class Parceiro {
    private int id;
    private String nome;
    private String tipoConta;
    private int numeroConta;
    private short numeroAgencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public short getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(short numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}
