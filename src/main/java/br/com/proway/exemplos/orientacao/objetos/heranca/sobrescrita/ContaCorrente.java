package br.com.proway.exemplos.orientacao.objetos.heranca.sobrescrita;

public class ContaCorrente extends Conta {

    private boolean permitidoSaldoNegativo = true;
    private double valorChequeEspecial;

    public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }

    public boolean isPermitidoSaldoNegativo() {
        return permitidoSaldoNegativo;
    }

    public void setPermitidoSaldoNegativo(boolean permitidoSaldoNegativo) {
        this.permitidoSaldoNegativo = permitidoSaldoNegativo;
    }
    
    // Será modificado o comportamento do método sacar da classe Conta(pai),
    // ou seja, estamos sobrescrevendo o comportamento do método sacar,
    // pois a conta corrente deve permitir sacar utilizando o cheque especial,
    // ou seja, a conta ficar com saldo negativo.
    @Override
    public boolean sacar(double valor){
        // Calcula o valor que tenho disponível na conta saldo + valor cheque especial
        double saldoAuxiliar = getSaldo() + getValorChequeEspecial();
       
        // verifica se o valor do saque é inferior ou igual ao saldo disponível
        if(valor <= saldoAuxiliar){
            // calcula o novo saldo subtraindo o valor do depósito
            double novoSaldo = getSaldo() - valor;
            
            // defini o novo saldo
            setSaldo(novoSaldo);
            
            return true;
        }
        
        return false;
    }
}
