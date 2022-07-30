package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class Funcionario implements FuncionarioInterface {

    private String nome;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double calcularSalarioBruto(int quantidadeHoras, double valorHoras) {
        return quantidadeHoras * valorHoras;
    }
    
    @Override
    public double calcularImpostoRenda(double salario) {
        if (salario < 1903.98) 
            return salario * 0;
        
        if (salario < 2826.66) 
            return salario * 0.075;
        
        if (salario < 3751.05) 
            return salario * 0.15;
        
        if (salario < 4664.68) 
            return salario * 0.22;
        
        return salario * 0.275;
    }

    @Override
    public double calcularSalarioLiquido(double salario, double imposto) {
        var salarioLiquido = salario - imposto;

        return salarioLiquido;
    }
}
