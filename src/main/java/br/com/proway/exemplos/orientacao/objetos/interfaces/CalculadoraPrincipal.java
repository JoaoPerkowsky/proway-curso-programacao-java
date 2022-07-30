package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        
        var calculadora = new Calculadora();
        
        var resultado = calculadora.somar(2, 30);
        var divisao = calculadora.dividir(5, 2);   
        var subtracao = calculadora.subtrair(5, 2);
        var multiplicacao = calculadora.multiplicar(10, 10);
        var ehMaior = calculadora.ehMaior(6, 5);
        var ehMenor = calculadora.ehMenor(1, 5);

        System.out.println("Resultado: " + resultado
        + "\nDivisao: " + divisao
        + "\nSubtracao: " + subtracao
        + "\nMultiplicacao: " + multiplicacao
        + "\nE maior que: " + ehMaior
        + "\nE menor que: " + ehMenor);
        
// Criar classe chamada Funcionario: nome
// Criar interface chamada FuncionarioInterface: 
// - CalcularSalarioBruto recebe valor hora e quantidade de horas
// - CalcularSalarioLiquido recebe Salario bruto e valor imposto de renda
// - Metodo CalcularImpostoDeRenda recebe Salario Bruto.
// Todos Retornam um double;
        
    }
}
