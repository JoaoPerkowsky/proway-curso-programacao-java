package br.com.proway.exemplos.orientacao.objetos.interfaces;

public interface FuncionarioInterface {
    double calcularSalarioBruto(int quantidadeHoras, double valorHoras);
    
    double calcularImpostoRenda(double salario);
    
    double calcularSalarioLiquido(double salario, double imposto);
}
