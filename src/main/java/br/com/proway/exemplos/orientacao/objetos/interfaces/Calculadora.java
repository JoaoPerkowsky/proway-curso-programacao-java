package br.com.proway.exemplos.orientacao.objetos.interfaces;

public class Calculadora implements CalculadoraInterface {

    @Override
    public int somar(int numero1, int numero2) {
        var soma = numero1 + numero2;

        return soma;
    }

    @Override
    public double dividir(int numero1, int numero2) {
        var resultado = (double) numero1 / numero2;

        return resultado;
    }

    @Override
    public int subtrair(int numero1, int numero2) {
        var resultado = numero1 - numero2;

        return resultado;
    }

    @Override
    public double multiplicar(int numero1, int numero2) {
        var resultado = (double) numero1 * numero2;

        return resultado;
    }

    @Override
    public boolean ehMaior(int numero1, int numero2) {
//        boolean ehMaior;
//        
//        if(numero1 > numero2){
//            ehMaior = true;
//        } else{
//            ehMaior = false;
//        }
//        
//        return ehMaior;
//        if (numero1 > numero2) {
//            return true;
//        }
//        return false;
return numero1 > numero2;
    }

    @Override
    public boolean ehMenor(int numero1, int numero2) {
//        if (numero1 < numero2) {
//            return true;
//        }
//        return false;
return numero1 < numero2;
    }
}

// Criar classe chamada Funcionario: nome
// Criar interface chamada FuncionarioInterface: 
// - CalcularSalarioBruto recebe valor hora e quantidade de horas
// - Metodo CalcularImpostoDeRenda recebe Salario Bruto.
// - CalcularSalarioLiquido recebe Salario bruto e valor imposto de renda
// Todos Retornam um double;