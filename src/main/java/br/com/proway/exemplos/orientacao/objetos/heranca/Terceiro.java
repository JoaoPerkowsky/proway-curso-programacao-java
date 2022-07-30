package br.com.proway.exemplos.orientacao.objetos.heranca;

// Terceiro herda os atributos e métodos públicos 
// e protected
public class Terceiro extends Parceiro {

    private String cpf;
    private double valorHora;
    private int quantidadeHoras;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

}
