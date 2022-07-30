package br.com.proway.exemplos.orientacao.objetos.instancia;

/**
 *
 * @author moc
 */
public class Calculadora {
    
    // encapsulamento + tipoAtributo + nomeAtributo;
    private double numero1;
    private double numero2;
    
    // Estrutura de um método
    // encapsulamento + tipoRetorno + nomeMetodo(parâmetros?)
    public void setNumero1(double numero1)
    {
        // armazenar no atributo numero1 o parâmetro numero1
        this.numero1 = numero1;
    }
    
    // Método que armazena o número 2
    public void setNumero2(double numero2){
        
        // armazena no atributo numero2 o parâmetro numero2
        this.numero2 = numero2;
    }
    
    // Método que permite obter o número armazenado no atributo numero1
    public double getNumero1(){
        // retorna o valor armazenado no atributo numero1
        return numero1;
    }
    
    // Método que permite obter o número armazenado no atributo numero2
    public double getNumero2(){
        // retorna o valor armazenado no atributo numero2
        return numero2;
    }
    
    public double somar(){
        var soma = numero1 + numero2;
        
        return soma;
    }
}
