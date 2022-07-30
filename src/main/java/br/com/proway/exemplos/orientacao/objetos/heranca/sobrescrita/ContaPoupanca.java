package br.com.proway.exemplos.orientacao.objetos.heranca.sobrescrita;

public class ContaPoupanca extends Conta {

    private int percentualAcrescimoInvestimento = 3;

    public int getPercentualAcrescimoInvestimento() {
        return percentualAcrescimoInvestimento;
    }

    public void setPercentualAcrescimoInvestimento(int percentualAcrescimoInvestimento) {
        this.percentualAcrescimoInvestimento = percentualAcrescimoInvestimento;
    }
}
