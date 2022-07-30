package br.com.proway.exemplos.orientacao.objetos.heranca.sobrescrita;

public class Conta {

    private String cliente;
    private double saldo;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean deposito(double valor) {
        // saldo = saldo + valor;
        saldo += valor;

        // Depósito foi realizado com sucesso
        return true;
    }

    public boolean sacar(double valor) {
        // Verifica se o valor do saque não deixa a conta negativa
        if (saldo - valor >= 0) {
            // Realiza o saque
            saldo -= valor;
            
            return true;
        }
        
        return false;
    }
}
