package br.com.proway.exemplos.orientacao.objetos.interfaces;

public interface CalculadoraInterface {
    // Contrato que obriga a classe que implementar esta interface a implementar
    // a logica referente ao metodo somar
    int somar(int numero1, int numero2); 
    
    double dividir(int numero1, int numero2);
    
    int subtrair(int numero1, int numero2);
    
    double multiplicar(int numero1, int numero2);
    
    boolean ehMaior(int numero1, int numero2);
    
    boolean ehMenor(int numero, int numero2);
}
